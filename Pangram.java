package practicePrograms;


import java.util.Scanner;

public class Pangram {
    static int letters[] = new int[26];
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String sentence;
        Scanner input = new Scanner(System.in);
        sentence = input.nextLine();
        if(isPangram(sentence.toLowerCase())){
            System.out.println("pangram");
        } else{
            System.out.println("not pangram");
        }
    }
    
    public static boolean isPangram(String sentence){
        char ch;
        int charValue;
        int counter = 0;
        for(int i = 0; i < sentence.length(); i++){
        	ch = sentence.charAt(i);
        	if(ch == ' '){
        		continue;
        	}
            charValue = ch - 97;
            letters[charValue] = 1;
        }
        
        for(int i = 0; i < letters.length; i++){
            if(letters[i] != 1){
                counter++;
            }
        }
        if(counter > 0){
            return false;
        } 
        return true;      
    }
}