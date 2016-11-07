import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyValue {
	
	private static Map<String, String> cacheMap = new HashMap<String, String>();
	private static Scanner in = new Scanner(System.in);
	
	private static String[] tokens;
	private static String input;
	private static final String OK_WORD = "OK";
	private static int tokensLength;
	
	public static void main(String[] args) {
		
		input = in.nextLine();
	    
	    tokens = input.split(" ");
	    tokensLength = tokens.length;
	    
	    if(tokensLength == 2){
	    	buildDataStructure(tokens[0], tokens[1]);
	    } else{
	    	buildDataStructure(tokens[0], tokens[1], tokens[2]);
	    }

	}
	
	public static void buildDataStructure(String command, String key) {
		String keyValue;
		do{
			switch(command){
				case "GET": if(cacheMap.containsKey(key)){
								keyValue = cacheMap.get(key);
								System.out.println(keyValue);
							} else{
								System.out.println("(null)");
							}
							break;
				case "DEL": cacheMap.remove(key);
							System.out.println(OK_WORD);
							break;
				case "EXISTS": if(cacheMap.containsKey(key)){
									System.out.println(1);
							   } else{
								   System.out.println(0);
							   }
							break;
				case "SET": buildDataStructure(tokens[0], tokens[1], null);
				default: 
					break;
				}
			String input = in.nextLine();
			tokens = input.split(" ");
			tokensLength = tokens.length;
			
			if(tokensLength == 2){
		    	command = tokens[0];
		    	key = tokens[1];
		    } else{
		    	buildDataStructure(tokens[0], tokens[1], tokens[2]);
		    }
			
		} while(command != null);
	}
	
	
	public static void buildDataStructure(String command, String key, String value) {
		if(value == null){
			System.out.println("ERROR: Not enough parameters");
		} else
			do{
				switch(command){
					case "SET": cacheMap.put(key, value);
								System.out.println(OK_WORD);	
								break;
					case "EXPIRE": System.out.println(OK_WORD);
								   System.out.println("[after " + value + " seconds]");
								   break;
				    default:
				    	break;
				}
				String input = in.nextLine();
				tokens = input.split(" ");
				tokensLength = tokens.length;
				
				if(tokensLength == 2){
			    	command = tokens[0];
			    	key = tokens[1];
			    	buildDataStructure(command, key);
			    } else{
			    	command = tokens[0];
			    	key = tokens[1];
			    	value = tokens[2];
			    }
			} while(command != null);
		}
}
