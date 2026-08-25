package soundable;

public class Dog implements Soundable {
	
	String dog;


	public Dog(String dog) {
		this.dog = dog;
	}


	@Override
	public String sound() {
		
		return dog;
	}



}
