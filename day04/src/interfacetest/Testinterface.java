package interfacetest;

public class Testinterface {

	public static void main(String[] args) {
		System.out.println(">>>> 말");
		Animal a = new Horse("당근");
		printDayLife(a);

	}
	
	static void printDayLife(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}

}
