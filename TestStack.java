package practicePrograms;

import java.util.Scanner;

public class TestStack {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of the Stack ");
        int size = scan.nextInt();
        
        /* Creating object of class arrayStack */
        Stack stack = new Stack(size);
        
        /* Perform Stack Operations */
        char ch;
        do{
        	System.out.println("===================");
            System.out.println("Stack Operations");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Check full");
            System.out.println("6. Size");
            System.out.println("7. Exit");
            System.out.println("===================");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                	stack.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stack.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("Peek Element = " + stack.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stack.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + stack.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + stack.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            stack.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                 
=======
	        System.out.println("Stack Test\n");
	        System.out.println("Enter Size of the Stack ");
	        int size = scan.nextInt();
	        
	        /* Creating object of class arrayStack */
	        Stack stack = new Stack(size);
	        
	        /* Perform Stack Operations */
	        char ch;
	        do{
	            System.out.println("===================");
	            System.out.println("Stack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. check full");
	            System.out.println("6. size");
	            System.out.println("===================");
	            int choice = scan.nextInt();
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter element to push");
	                try 
	                {
	                	stack.push( scan.nextInt() );
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }                         
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = " + stack.pop());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }    
	                break;                         
	            case 3 :         
	                try
	                {
	                    System.out.println("Peek Element = " + stack.peek());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = " + stack.isEmpty());
	                break;                
	            case 5 :
	                System.out.println("Full status = " + stack.isFull());
	                break;                 
	            case 6 : 
	                System.out.println("Size = " + stack.getSize());
	                break;         
	            case 7 : 
	                System.exit(0);
	                break;         
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }
	            /* display stack */
	            stack.display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);
	 
	        } while (ch == 'Y'|| ch == 'y');                 
	}
}
