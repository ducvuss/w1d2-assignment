public class Circle implements Shape {

    private final int radius;
	private int area;

	public Circle(final int radius) {
        this.radius = radius;
    }
	@Override
	public void calculateArea() {
        this.area = (int)(radius * radius * Math.PI);
	}

	@Override
	public void display() {
		System.out.println("The area of a circle is Pi x radius^2 : " + this.area);
	}

}