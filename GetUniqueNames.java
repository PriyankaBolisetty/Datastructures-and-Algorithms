package practicePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class GetUniqueNames {
	
	private static Set namesDir = new HashSet<String>();
	
	public static void main(String[] args){
		int n;
		Iterator<String> nameKeys;
		
		Scanner s = new Scanner(System.in);
	    n  = s.nextInt();
	    
	    for (int i = 0; i < n; i++) {
	    	namesDir.add(s.next());
	    }
	    
	    nameKeys = namesDir.iterator();	
	    while(nameKeys.hasNext()){
	    	String name = nameKeys.next();
	    	System.out.println(name);
	    }	
	}
}
