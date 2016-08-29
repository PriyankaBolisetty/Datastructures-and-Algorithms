package Mountain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SortMountains {
	LinkedList<Mountain> mtnList = new LinkedList<Mountain>();
	
	class HeightCompare implements Comparator<Mountain>{
		public int compare(Mountain mtn1, Mountain mtn2){
			return mtn1.getHeight().compareTo(mtn2.getHeight());
		}
	}
	
	public static void main(String[] args) {
		new SortMountains().go();
	}
	
	public void go(){
		getMountains();
		
		System.out.println("List of all Mountains in a file");
		System.out.println("=====================================");
		System.out.println(mtnList);
		
		//Compare by name
		Collections.sort(mtnList);
		System.out.println("\nList of all Mountains sorted by Name");
		System.out.println("=====================================");
		System.out.println(mtnList);
		
		HeightCompare heightCompare = new HeightCompare();
		
		//Compare by height
		Collections.sort(mtnList, heightCompare);
		System.out.println("\nList of all Mountains sorted by Height");
		System.out.println("=====================================");
		System.out.println(mtnList);	
		
		Set<Mountain> mtnSet = new HashSet<Mountain>();
		mtnSet.addAll(mtnList);
		System.out.println("\nList of all Mountains after removing duplicates");
		System.out.println("====================================================");
		System.out.println(mtnSet);
		
		Set<Mountain> mtnTreeSet = new TreeSet<Mountain>();
		mtnTreeSet.addAll(mtnList);
		System.out.println("\nList of all Mountains sorted by Name");
		System.out.println("====================================================");
		System.out.println(mtnTreeSet);
	}
	
	public void getMountains() {
		try{
			File file = new File("src/MountainList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = reader.readLine()) != null){
				addMountain(line);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void addMountain(String line) {
		StringTokenizer tokens = new StringTokenizer(line, " ");
		
		Mountain mountain = new Mountain(tokens.nextToken(), Integer.parseInt(tokens.nextToken()));
		mtnList.add(mountain);
	}
}
