package JavaInterviewsExposed;

public class CountOccurencesOfLettersInArray {

	public static void main(String[] args) {
		
		//Example steps to convert an integer to character
		char ch = 'a';
		System.out.println("Integer value of character: " + (int)ch);
		
		int n = 'z';
		System.out.println(n);
		
		int diff = 'z' - 'a' + 1;
		System.out.println(diff);
		
		//Get a random lowercase letter
		int i = (int)('a' + Math.random() * ('z' - 'a' + 1)); 
		System.out.println(i + ", " + (char)i);
		
		char[] charArray =  assignLettersToArray();
		int[] countArray = countOccurance(charArray);
		printArray(charArray);
		printArray(countArray);
	}
	
	public static char[] assignLettersToArray(){
		char[] charArray = new char[100];
		int length = charArray.length;
		
		for(int i = 0; i < length - 1; i++){
			charArray[i] = generateRandomCharacter();
		}
		return charArray;
	}
	
	public static char generateRandomCharacter(){
		int random = (int)('a' + Math.random() * ('z' - 'a' + 1));
		return (char)random;
	}
	
	public static void printArray(char[] array){
		for(char ch: array){
			System.out.print(ch + ", ");
		}
		System.out.println();
	}
	
	public static void printArray(int[] array){
		for(int i: array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static int[] countOccurance(char[] charArray){
		int[] countArray = new int[26];
		int length = charArray.length;
		
		for(int i = 0; i < length - 1; i++){
			countArray[charArray[i] - 'a']++;
		}
		
		return countArray;
	}

}
