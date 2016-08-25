package practicePrograms;

import java.util.Scanner;

public class TestQueue {

	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	 
	        System.out.println("Queue Test");
	        System.out.println("Enter the size of Queue ");
	        int n = scan.nextInt();
	        /* creating object of class arrayQueue */
	        Queue q = new Queue(n);        
	        /* Perform Queue Operations */        
	        char ch;
	        do{
	        	System.out.println("===================");
	            System.out.println("Queue Operations");
	            System.out.println("1. Add");
	            System.out.println("2. Remove");
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
	                System.out.println("Enter an element to add");
	                try
	                {
	                    q.add( scan.nextInt() );
	                }
	                catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }                         
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Removed Element = "+q.remove());
	                }
	                catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	                break;                         
	            case 3 : 
	                try
	                {
	                    System.out.println("Peek Element = "+q.peek());
	                }
	                catch(Exception e)
	                {
	                    System.out.println("Error : "+e.getMessage());
	                }
	                break;                            
	            case 4 : 
	                System.out.println("Empty status = "+q.isEmpty());
	                break;                
	            case 5 : 
	                System.out.println("Full status = "+q.isFull());
	                break;                          
	            case 6 : 
	                System.out.println("Size = "+ q.getSize());
	                break;                         
	            case 7 : 
	                System.exit(0);
	                break;                         
	            default : System.out.println("Wrong Entry \n ");
	                break;
	            }
	            /* display Queue */
	            q.display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);
	 
	        } while (ch == 'Y'|| ch == 'y');                                                        
	    }    
}
