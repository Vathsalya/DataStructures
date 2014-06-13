import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
	String label;
	List<Node> children;

	public Node(String s){
		this.label=s;
	}
	public Node(String s,List<Node> list){
		this.label = s;
		this.children = list;
	}
	public static List<Node> traverseTreeAndReturnListContainingAllNodes(Node n){

		List<Node> allTreeNodes = new LinkedList<Node>();
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(n); //Add first node to queue

		while(queue.size()!=0)//Start iterating over queue
		{
			if(queue.size()>=1){
				Node temp = queue.removeFirst(); //Remove 
				allTreeNodes.add(temp); //Process node
				if(temp.children!=null){//add children to queue
					for(Node child : temp.children)
					{
						queue.addLast(child);
					}
				}
			}
		}
		return allTreeNodes;

	}
	public static void main(String[] args) {
		Node n1 = new Node("1");
		Node n2 = new Node("2");
		Node n3 = new Node("3");
		Node n4 = new Node("4");
		Node n5 = new Node("5");
		Node n6 = new Node("6");
		Node n7 = new Node("7");
		Node n8 = new Node("8");
		Node n9 = new Node("9");

		n5.children = new ArrayList<>();
		n5.children.add(n8);

		n2.children = new ArrayList<>();
		n2.children.add(n5);

		n1.children = new ArrayList<>();
		n1.children.add(n2);
		n1.children.add(n3);
		n1.children.add(n4);

		n4.children = new ArrayList<>();
		n4.children.add(n6);
		n4.children.add(n7);

		n7.children = new ArrayList<>();
		n7.children.add(n9);

		List<Node> nodes = traverseTreeAndReturnListContainingAllNodes(n1);
		for(Node n:nodes)
			System.out.println(n.label);

	}

}
