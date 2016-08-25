package practicePrograms;

import java.util.NoSuchElementException;

public class Stack {
	private int size;
	private int[] stackArray;
	private int top, len;
	
	public Stack(int size){
		this.size = size;
		stackArray = new int[size];
		len = 0;
		top = -1;
	}
	
	//Check if Stack is empty
	public boolean isEmpty(){
		return top == -1;
	}
	
	//Check if Stack is full
	public boolean isFull(){
		return top == size - 1;
	}
	
	//Get the size of the stack
	public int getSize(){
		return len;
	}
	
	//Get the top element of the Stack
	public int peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		return stackArray[top];
	}
	
	//Add an element to the stack
	public void push(int i){
		if(top + 1 >= size){
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		stackArray[++top] = i;
		len++;
	}
	
	//Delete an element from the stack
	public int pop(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("Underflow Exception");
		}
		len--;
		return stackArray[top--];
	}

	//Display the status of Stack
	public void display(){
		System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(stackArray[i]+" ");
        System.out.println();
    }    
}
