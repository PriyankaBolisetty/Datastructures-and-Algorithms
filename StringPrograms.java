package JavaInterviewsExposed;

public class StringPrograms {

	public static void main(String[] args) {
		
		sortString("this is a very beautiful world", "dthrl");
		superReducedString("aaabccddd");
		camelCase("saveChangesInTheEditor");
		reverseWords("Do or do not, there is no try.");
		compareTwoCharacters('b', 'b');
	}
	
	public static void sortString(String inputStr, String sortStr){
		Character iChar;
		Character jChar;
		
		StringBuffer otherStr = new StringBuffer(inputStr);
		
		for(int i = 0; i < sortStr.length(); i++){
			iChar = sortStr.charAt(i);
		
			for(int j = 0; j < inputStr.length(); j++){
				jChar = inputStr.charAt(j);
				int res = iChar.compareTo(jChar);
				if(res == 0){
					System.out.print(iChar);
					otherStr.setCharAt(j, ' ');
				}
			}
		}
		System.out.println(otherStr);
	}
	
	
	public static void superReducedString(String str){
		StringBuffer strBuff = new StringBuffer(str);
		for (int i = 0; i < strBuff.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                
                strBuff.delete(i, i+1);
            }
        }
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println (strBuff);
        }
	}
	
	public static void camelCase(String str){
		int iChar;
		String eachStr = "";
		int j = 0, counter = 0;
		
		for(int i = 0; i < str.length(); i++){
			iChar = str.charAt(i);
			if(!(iChar >= 97 && iChar <= 122)){
				eachStr = str.substring(j, i);
				j = i;
			}else if(i == (j + 1)){
				System.out.println(str.substring(j, str.length()));
				counter++;
			}
			System.out.println(eachStr);
		}
		System.out.println(counter);
	}
	
	public static void reverseWords(String str) {
		String[] words = str.split(" ");
		int length = words.length;
		for(int i = length - 1; i >= 0; i--){
			System.out.print(words[i] + " ");
		}	
	}
	
	public static void compareTwoCharacters(Character c1, Character c2){
	      // create an int type
	      int res;

	      // compare c1 with c2 and assign result to res
	      res = c1.compareTo(c2);

	      String str1 = "Both values are equal ";
	      String str2 = "First character is numerically greater";
	      String str3 = "Second character is numerically greater";

	      if( res == 0 ){
	      	 System.out.println( str1 );
	      }
	      else if( res > 0 ){
	      	 System.out.println( str2 );
	      }
	      else if( res < 0 ){
	      	 System.out.println( str3 );
	      }
	}
}
