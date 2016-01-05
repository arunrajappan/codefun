package algorithms.fun;

import java.util.List;

public class BinaryTree {
	
	private Node root = null;

	public Node getRoot() {
		return root;
	}
	
	public BinaryTree(){}
	
	public BinaryTree(List<Integer> values){
		for(Integer value : values){
			insert(value);
		}
	}

	/**
	 * Function to traverse the binary tree from a given node
	 * @param node
	 */
	public static void traverseAndPrintTree(Node node, String prefix){
		//new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		if(node == null){			
			return;
		}
		System.out.print(prefix+node.getValue() + " ");
		
		Node leftChild = node.getLeft();
		Node rightChild = node.getRight();
		
		if(leftChild != null){
			//System.out.print(leftChild.getValue() + " ");
			
		}
		
		if(rightChild != null){
			//System.out.print(rightChild.getValue() + " ");
		}
		traverseAndPrintTree(leftChild, "L-");
		traverseAndPrintTree(rightChild, "R-");	
		
	}
	
	public int insert(int value){
		if(this.root == null){
			root = new Node();
			root.setValue(value);
			return 1;
		}
		return addNewNode(root, value);
	}
	
	private int addNewNode(Node node, int value){
		if(node.getValue() > value){
			if(!node.hasLeftChild()){
				Node newNode = new Node();
				newNode.setValue(value);
				node.setLeft(newNode);
			}else{
				addNewNode(node.getLeft(),value);
			}
		}else{
			if(!node.hasRightChild()){
				Node newNode = new Node();
				newNode.setValue(value);
				node.setRight(newNode);
			}else{
				addNewNode(node.getRight(),value);
			}
		}
		return 1;
	}
	
	public boolean compareTo(BinaryTree bt){
		return compareNodes(this.root, bt.getRoot());
	}
	
	private boolean compareNodes(Node n1, Node n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		if(n1.getValue() == n2.getValue()){
			boolean isLeftTreeSame = false;
			if(n1.hasLeftChild() == n2.hasLeftChild()){
				isLeftTreeSame = compareNodes(n1.getLeft(), n2.getLeft());
			}else{
				return false;
			}
			
			if(n1.hasRightChild() == n2.hasRightChild() && isLeftTreeSame){
				return compareNodes(n1.getRight(), n2.getRight());
			}else{
				return false;
			}
		}
		
		return false;
		
		
	}
	
}
