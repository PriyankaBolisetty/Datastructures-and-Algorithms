package Mountain;

public class Mountain implements Comparable<Mountain>{
	private String name;
	private Integer height;
	
	public Mountain(String name, Integer height){
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public Integer getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return name + " " + height;
	}
	
	public int compareTo(Mountain otherMountain){
		return name.compareTo(otherMountain.getName());
	}
	
	//Overriding hashCode to check for the duplicate reference equality
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	//Overriding equals to check for the duplicate object equality
	@Override
	public boolean equals(Object otherObj){
		Mountain otherMtn = (Mountain)otherObj;
		if(!(otherMtn instanceof Mountain)){
			return false;
		}
		return getName().equals(otherMtn.getName());
	}
}
