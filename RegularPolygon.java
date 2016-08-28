package practicePrograms;

public enum RegularPolygon {
	TRIANGLE(3), SQUARE(4), PENTAGON(5);
	private Shape shape;

	public Shape getShape(Shape shape) {
		return shape;
	}
	
	private RegularPolygon(int sides){
		switch(sides){
			case 3:
				Triangle triangle = new Triangle();
				triangle.setSides(3);
				System.out.println(triangle);
				break;
			case 4:
				Rectangle rectangle = new Rectangle();
				rectangle.setSides(4);
				System.out.println(rectangle);
				break;
			case 5:
				Pentagon pentagon = new Pentagon();
				pentagon.setSides(5);
				System.out.println(pentagon);
				break;
			default:
				System.out.println("Invalid statement..");
				break;
		}
	}
}
