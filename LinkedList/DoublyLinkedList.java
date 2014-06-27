package LinkedList;
public class DoublyLinkedList {
	public Node head = new Node(null);
	public Node tail = new Node(null);
	public int size = 0;
	
	public DoublyLinkedList(){
		head.setPrevious(null);
		head.setNext(tail);
		tail.setPrevious(head);
		tail.setNext(null);
		size = 0;
	}
	
	public Node get(int index) throws IndexOutOfBoundsException{
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException();
		else{
			Node cursor = head;
			for(int i = 0;i< index;i++){
				cursor = cursor.Next;
			}
			return cursor;
		}
	}
	
	public Object removeNode(int index) throws IndexOutOfBoundsException{
		if(index==0)
			throw new IndexOutOfBoundsException();
		else{
			Node resultedNode = get(index);
			resultedNode.getPrevious().setNext(resultedNode.Next);
			resultedNode.getNext().setPrevious(resultedNode.Previous);
			size--;
			System.out.println(resultedNode.getData());
			return resultedNode.getData();
		}
	}
	
	public void add(int index, Object element){
		Node cursor = get(index);
		Node temp = new Node(element);
		
		temp.setPrevious(cursor);
		temp.setNext(cursor.getNext());
		cursor.getNext().setPrevious(temp);
		cursor.setNext(temp);
		
		
		size++;
	}
	
	public void addHead(Object element){
		Node cursor = head;
		Node temp = new Node(element);
		
		temp.setPrevious(cursor);
		temp.setNext(cursor.getNext());
		cursor.getNext().setPrevious(temp);
		cursor.setNext(temp);
		
		
		size++;
	}
	
	public void addTail(Object element){
		Node cursor = tail.getPrevious();
		Node temp = new Node(element);
		
		temp.setPrevious(cursor);
		temp.setNext(cursor.getNext());
		cursor.getNext().setPrevious(temp);
		cursor.setNext(temp);
	
		
		size++;
	}
	
	public String toString() { // COPIED THIS METHOD :D :D :D
		StringBuffer result = new StringBuffer();
		result.append("(head) - ");
		Node temp = head;
		while (temp.getNext() != tail) {
			temp = temp.getNext();
			result.append((temp).getData() + " -> ");
		}
		result.append("(tail)");
		return result.toString();
	}
	
	public static void main(String argv[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addHead(new Integer(1));
		list.addHead(new Integer(2));
		list.addTail(new Integer(9));
		list.addHead(new Integer(3));
		list.addTail(new Integer(11));
		list.add(2, new Integer(0));
	//	System.out.println(list);
		list.removeNode(list.size);
		System.out.println(list+"mmmmmm 1 "+list.size);
		DoublyLinkedList list1 = new DoublyLinkedList();
		list1.addHead(new Integer(11));
		list1.addHead(new Integer(2));
		list1.addTail(new Integer(91));
		list1.addHead(new Integer(32));
		list1.addTail(new Integer(11));
		list1.add(2, new Integer(0));
		list1.removeNode(list1.size);
		System.out.println(list1+"mmmmmm 2 "+list1.size);
		
		list.ListAddition(list,list1);
		list.ListSub(list,list1);
		
	}

	private void ListSub(DoublyLinkedList list1, DoublyLinkedList list2) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		// TODO Auto-generated method stub
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		int i = 0;
		for(i=0;i<list1.size;i++){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
			int data1 = (int) temp1.data;
			int data2 = (int) temp2.data;
			list.add(i, (data1-data2));
			System.out.println(data1-data2);
		}
		System.out.println("SUB LIST "+list);
	}

	private void ListAddition(DoublyLinkedList list1, DoublyLinkedList list2) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		// TODO Auto-generated method stub
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		int i = 0;
		for(i=0;i<list1.size;i++){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
			int data1 = (int) temp1.data;
			int data2 = (int) temp2.data;
			list.add(i, (data1+data2));
			System.out.println(data1+data2);
		}
		System.out.println("ADDED LIST "+list);
	}
}

