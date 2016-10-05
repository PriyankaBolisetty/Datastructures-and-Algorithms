package JavaInterviewsExposed;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println(findFirstNonRepetatedChar("teeyterrxyz"));
	}
	
	public static Character findFirstNonRepetatedChar(String str){
		Hashtable charHash = new Hashtable();
		int i, length = str.length();
		Character c;
		Integer intgr;
		
		for(i = 0; i < length; i++){
			c = str.charAt(i);
			intgr = (Integer)charHash.get(c);
			if(intgr == null){
				charHash.put(c, new Integer(1));
			} else{
				charHash.put(c, new Integer(intgr.intValue() + 1));
			}
		}
		
		Set<Character> charSet = charHash.keySet();
		Iterator<Character> charKeys = charSet.iterator();
		while(charKeys.hasNext()){
			System.out.println(charHash.get(charKeys.next()));
		}
		
		//Search in Hashtable 
		for(i = 0; i < length; i++){
			c = str.charAt(i);
			int it = (Integer)charHash.get(c);
			if(it == 1){
				return c;
			}
		}
		return null;
	}

}
