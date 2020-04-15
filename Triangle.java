public class Triangle implements Shape {

    private final int height;
	private final int base;
	private int area;

	public Triangle(final int height, final int base) {
        this.height = height;
        this.base = base;
	}
	
	@Override
	public void calculateArea() {
        this.area = (int)(height * base * 0.5);
	}

	@Override
	public void display() {
		System.out.println("The area of a triangle is 1/2 x height x base: " + this.area);
	}

}