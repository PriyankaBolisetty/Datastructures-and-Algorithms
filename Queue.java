package practicePrograms;

import java.util.NoSuchElementException;

public class Queue {
	private int[] queueArray;
	private int size, len, head, tail;
	
	public Queue(int size){
		this.size = size;
		len = 0;
		queueArray = new int[size];
		head = -1;
		tail = -1;
	}
	
	//Check if the Queue is empty
	public boolean isEmpty(){
		return head == tail;
	}
	
	//Check if the Queue is full
	public boolean isFull(){
		return head == tail + 1 || head == 1 && tail == len;
	}
	
	//Get the size of the Queue
	public int getSize(){
		return len;
	}
	
	//Get the peek element in Queue
	public int peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		return queueArray[head];
	}
	
	public void add(int i){
		if (tail == -1) 
        {
            tail = 0;
            head = 0;
            queueArray[tail] = i;
        }
        else if (tail + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( tail + 1 < size)
        	queueArray[++tail] = i;    
        len++ ;    
	}
	
	public int remove(){
		int removedElement;
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		len--;
		removedElement = queueArray[head];
		if(head == tail){
			head = -1;
			tail = -1;
		}
		head++;
		return removedElement;
	}
	
	//Display the Queue
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = head; i <= tail; i++)
            System.out.print(queueArray[i]+" ");
        System.out.println();        
    }
}
