package circle;

public class Cylinder extends CircleTemplate{
	
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;

	}

	public double getHeight() {
		return height;
	}
	
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return 2* PI * getRadius() * getRadius()+(2*PI*getRadius()*height);
	}
}
