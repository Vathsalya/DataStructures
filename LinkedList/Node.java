package LinkedList;

public class Node {
	Object data;
	Node Previous;
	Node Next;
	
	public Node(Object data){
		this.data = data;
	}
	
	public Node(Object data,Node Previous,Node Next){
		setData(data);
		setPrevious(Previous);
		setNext(Next);
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public void setPrevious(Node Previous){
		this.Previous = Previous;
	}
	
	public void setNext(Node Next){
		this.Next = Next;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public Node getPrevious(){
		return this.Previous;
	}
	
	public Node getNext(){
		return this.Next;
	}
}