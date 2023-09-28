package junk;

public class BinarySearchTree {

	class Node {
		int data; 
		Node left, right;
		
		public Node (int data) {
			data = data;
			left = right = null;
		}
	}
	
	Node root;
	
	BinarySearchTree() {
		root = null;
	}
	
	public void insert(int newData) {
		
		if (insert(root, newData)) {
			System.out.println(newData + "Node added successfully");
		} else {
			System.out.println("OOPSS!! some problem occured!");
		}
	}
	
	private boolean insert(Node current, int newData) {
		// return a new node if the tree is empty
		if (current == null) {
			current = new Node(newData);
			return true;
		}
		
		// traverse to the right place and insert the node
		if (newData < current.data) {
			return insert(current.left, newData);
		} else if (newData > current.data) {
			return insert(current.right, newData);
		}
		return false;
	}
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(Node current) {
		if (current == null) {
			return ;
		}
		System.out.print(current.data + " -> ");
		preorder(current.left);
		preorder(current.right);
	}
	
	public void inorder() {
		inorder(root);
	}
	
	private void inorder(Node current) {
		if (current == null) {
			//System.out.println(" ");
			return;
		}
		
		inorder(current.left);
		System.out.print(current.data + " -> ");
		inorder(current.right);
	}
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(Node current) {
		if (current == null) {
			return;
		}
		
		postorder(current.left);
		postorder(current.right);
		System.out.print(current.data + " -> ");
	}
	
	void deleteNode(Node node) {
		deleteNode(this.root, node);
	}
	
	void deleteNode(Node current, Node node) {
		if (current == null) {
			return;
		}
		else if (node.data < current.data) {
			deleteNode(current.left, node);
		} else if (node.data > current.data) {
			deleteNode(current.right, node);
		} else if (current.data == node.data) {
			if (current.left == null && current.right == null) {
				current = null;
			} else if (current.right == null) {
				current = current.left;
				return;
			} else if (current.left == null) {
				current = current.right;
			} else {
				// tough one
			}
			
		}
	}
	
	public Node search(int data) {
		return search(this.root, data);
	}
	
	private Node search(Node current, int data) {
		if (current == null) {
			System.out.println("Node doesn't exist in this Binary Search Tree");
			return null;
		} else if (current.data == data) {
			return current;
		} else if (current.data > data) {
			return search(current.left, data);
		}
		return search(current.right, data);
	}
	
	public int minValue(Node current) {
		if (current.left == null) {
			return current.data;
		}
		return minValue(current.left);
	}
	
	public int maxValue(Node current) {
		if (current.right == null) {
			return current.data;
		}
		return maxValue(current.right);
	}
	
}
