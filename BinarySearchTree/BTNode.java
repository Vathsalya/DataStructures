package BinarySearchTree;

public class BTNode {
	int value;
	BTNode leftChild;
	BTNode rightChild;
	
	public BTNode(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BTNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BTNode leftChild) {
		this.leftChild = leftChild;
	}
	public BTNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BTNode rightChild) {
		this.rightChild = rightChild;
	}
	
}
