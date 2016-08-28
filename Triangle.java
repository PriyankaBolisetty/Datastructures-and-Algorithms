package practicePrograms;

public class Triangle implements Shape{
	private int sides;
	
	public void setSides(int sides){
		this.sides = sides;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public String toString(){
		return "A Triangle is created with " + getSides() + " sides";
	}
}
