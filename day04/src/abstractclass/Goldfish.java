package abstractclass;

public class Goldfish extends Animal {
	
	public Goldfish(String meal) {
		this.meal = meal;
	}


	@Override
	public void move() {
		System.out.println("날아다닌다");
		
	}


}
