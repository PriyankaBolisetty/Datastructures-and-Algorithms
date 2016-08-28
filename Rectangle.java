package practicePrograms;

public class Rectangle implements Shape{
	private int sides;
	
	public void setSides(int sides){
		this.sides = sides;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public String toString(){
		return "A Rectangle is created with " + getSides() + " sides";
	}
}
