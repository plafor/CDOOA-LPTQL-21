package liskov;

public class LspTest {

	public static void main(String args[]) {
		Square aSquare = new Square(5);
		System.out.println(aSquare.getArea());
		
		aSquare.setSize(10);
		System.out.println(aSquare.getArea());
		
	}

}
