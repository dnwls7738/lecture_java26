package circle;


public class Ball extends CircleTemplate {
	
	public Ball(double radius) {
		super(radius);
	}

	@Override
	public double getArea() {
		return 4* PI * getRadius() * getRadius();
	}


}
