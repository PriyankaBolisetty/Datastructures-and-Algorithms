package practicePrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
        String str = sc.next();
        /* Enter your code here. Print output to STDOUT. */
       
        System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str){
		int low = 0 ;
		int high = str.length() - 1;
		String reversedStr = "";
		
		while(low < high){
			if(str.charAt(low) != str.charAt(high))
				return false;
			
			low++;
			high--;
		}
		return true;
	}
}
