package practicePrograms;

import java.util.NoSuchElementException;

public class Queue {
	private int[] queueArray;
	private int size, len, front, rear;
	
	public Queue(int size){
		this.size = size;
		len = 0;
		queueArray = new int[size];
		front = -1;
		rear = -1;
	}
	
	//Check if the Queue is empty
	public boolean isEmpty(){
		return front == -1;
	}
	
	//Check if the Queue is full
	public boolean isFull(){
		return front == 0 && rear == size - 1;
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
		return queueArray[front];
	}
	
	public void add(int i){
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            queueArray[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
        	queueArray[++rear] = i;    
        len++ ;    
	}
	
	public int remove(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		len--;
		front++;
		return queueArray[front]; 
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
        for (int i = front; i <= rear; i++)
            System.out.print(queueArray[i]+" ");
        System.out.println();        
    }
}
