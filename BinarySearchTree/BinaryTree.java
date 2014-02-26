package BinarySearchTree;

import java.util.HashSet;

public class BinaryTree {
	
static	int count= 0; 
static int [] arr = new int[1000];
	public static void main(String args[]){
		//BTNode root = new BTNode(9);
		
		
		BTNode root1 = new BTNode(5000);
		BinaryTree bt = new BinaryTree();
	/*	bt.insertNode(root, 12);
		bt.insertNode(root, 10);
		bt.insertNode(root, 6);
		bt.insertNode(root, 4);
		bt.insertNode(root, 1);
		bt.insertNode(root, 15);
		bt.insertNode(root, 8);
		bt.insertNode(root, 3);*/
		HashSet<Integer> set = new HashSet<Integer>();
		int temp =0;
		for (int i = 0; i< 1000; i++)
		{
			temp = ((int)(Math.random()*10000));
			if(temp!=5000)
			 set.add(temp);
			
		}
		
		for(int i : set)
		{
			bt.insertNode(root1, i);
		}
		
		bt.display(root1);
		
		
		for (int i=0; i <999 && i < set.size();i++)
		{
			
			if(!(arr[i+1]>arr[i]))
			{
				System.out.println(arr[i+1] + " " + arr[i]);
				
			}
		}
		System.out.println("Works fine");
	}
	private void display(BTNode root) {
		// TODO Auto-generated method stub
	//	System.out.println("BINARY TREE");
		
		if(root.getLeftChild()!=null)
			display(root.leftChild);
		System.out.println(root.getValue());
		arr[count]=root.getValue();
		count++;
		if(root.getRightChild()!=null)
			display(root.rightChild);
		//System.out.println("BINARY TREE");
	}
	public void insertNode(BTNode root,int value){
		int currRootValue = root.getValue();
		if(value > currRootValue){
			if(root.getRightChild()!=null){
				insertNode(root.getRightChild(), value);
			}else{
				BTNode rightNode = new BTNode(value);
				root.setRightChild(rightNode);
			}
		}else{
			if(root.getLeftChild()!=null){
				insertNode(root.getLeftChild(), value);
			}else{
				BTNode leftNode = new BTNode(value);
				root.setLeftChild(leftNode);
			}
		}
	}
}
