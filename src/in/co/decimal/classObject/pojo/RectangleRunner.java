package in.co.decimal.classObject.pojo;


public class RectangleRunner {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 5);

		System.out.println(rectangle);

		int perimeter = rectangle.perimeter();
		System.out.println(perimeter);

		int area = rectangle.area();
		System.out.println(area);

		double diagonal = rectangle.digonal();
		System.out.println(diagonal);
	}
	
}
