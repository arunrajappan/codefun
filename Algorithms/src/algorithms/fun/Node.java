package algorithms.fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
	private int value = -1;
	private Node left = null;
	private Node right = null;
	private String label = "";
	
	public Node(){}
	
	public String getLabel(){
		return this.label;
	}
	
	public void setLabel(String label){
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	public boolean hasLeftChild(){
		return (left == null ? false : true);
	}
	public boolean hasRightChild(){
		return (right == null ? false : true);
	}
	
	public String printData(){
		return ""+value;
	}
	
	
}
