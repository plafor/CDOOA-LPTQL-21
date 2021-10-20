package liskov;

class Square {
	
	private Rectangle rect;
	
	public Square(int size) {
		rect = new Rectangle(size, size);
	}

	public void setSize(int newSize) {
		rect.setHeight(newSize);
		rect.setWidth(newSize);
	}
	
	public int getArea() {
		return rect.getArea();
	}
}