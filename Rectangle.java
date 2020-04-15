public class Rectangle implements Shape {

    private final int width;
	private final int height;
	private int area;

	public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }
	@Override
	public void calculateArea() {
        this.area = width * height;
	}

	@Override
	public void display() {
		System.out.println("The area of a rectangle is width x height: " + this.area);
	}

}