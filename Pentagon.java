package practicePrograms;

public class Pentagon implements Shape{
	private int sides;
	
	public void setSides(int sides){
		this.sides = sides;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public String toString(){
		return "A Pentagon is created with " + sides + " sides";
	}
}
