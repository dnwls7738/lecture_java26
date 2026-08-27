package soundable;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		
		Soundable cat =  new Cat("냐옹");
		Soundable dog =  new Dog("멍멍");
		
		printSound(cat);
		printSound(dog);
	}

}
