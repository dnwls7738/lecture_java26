package circle;

public abstract class CircleTemplate {
	
	final public static double PI = 3.14;
	private double radius;
	

	public CircleTemplate(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double setRadius(double radius) {
		return radius;
	}

	public double getRadius() {
		return radius;
	}

}
