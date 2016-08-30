package binarysearchtrees;
public class BinarySearchTree {

	public static Node root;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public void inOrderTreeWalk(Node root){
		if(root!=null){
			inOrderTreeWalk(root.left);
			System.out.print(" " + root.data);
			inOrderTreeWalk(root.right);
		}
	}
	
	public boolean search(int id){
		Node current = root;
		while(current != null){
			if(current.data > id){
				current = current.left;
			} else if(current.data < id){
				current = current.right;
			} else{
				return true;
			}
		}
		return false;
	}
	
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public int treeMinimum(){
		Node current = root;
		int min = 0;
		while(current != null){
			min = current.data;
			current = current.left;
		}
		System.out.println(min);
		return min;
	}
	
	public int treeMaximum(){
		Node current = root;
		int min = 0;
		while(current != null){
			min = current.data;
			current = current.right;
		}
		System.out.println(min);
		return min;
	}
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(100);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.inOrderTreeWalk(b.root);		
		System.out.println("");
		
		System.out.println(b.search(99));
		b.treeMinimum();
		b.treeMaximum();
	}

}
