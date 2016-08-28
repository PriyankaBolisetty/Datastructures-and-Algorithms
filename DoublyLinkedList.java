package practicePrograms;

import practicePrograms.Node;

public class DoublyLinkedList {
	
	private Node next;
	private Node prev;
	private Node head;
	
	public DoublyLinkedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head = newNode;
		}
		newNode.setNext(head);
		head = newNode;
	}
	
	public void delete(int element){
		
	}
	
	public void search(int element){
		
	}
	
	public void display(){
		/*Node currentNode = head;
		while(currentNode != null){
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}*/
	}
}
