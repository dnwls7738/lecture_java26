package start;

class Animal {
	String eye = "눈";
	String mouth = "주둥이";
	
	void eat() {
		System.out.println("먹이를 먹는다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
}

class Eagle extends Animal {
	String wing = "날개";
	
	void fly() {
		System.out.println("날아다닌다.");
	}
}

class Tiger extends Animal {
	String leg = "앞다리";
	
	void run() {
		System.out.println("달린다.");
	}
}

class Goldfish extends Animal {
	String Fin = "지느러미";
	
	void swim() {
		System.out.println("헤엄친다.");
	}
}

public class Example01 {

	public static void main(String[] args) {
		System.out.println(">>>> 독수리");
		Eagle e = new Eagle();
		e.eat();
		e.fly();
		e.sleep();
		
		System.out.println(">>>> 호랑이");
		Tiger t = new Tiger();
		t.eat();
		t.run();
		t.sleep();
		
		
		System.out.println(">>>> 금붕어");
		Goldfish g = new Goldfish();
		g.eat();
		g.swim();
		g.sleep();
		
		
	}

}
