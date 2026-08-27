package icountable;

public class CoutTest {


	public static void main(String [] args) {
		Countable[] countables = {
	            new Bird("뻐꾸기", 5),
	            new Bird("독수리", 2),
	            new Tree("사과나무", 10),
	            new Tree("밤나무", 7)
	        };
		
		
		for (Countable c : countables) {
            c.count();
        }
		
		for (Countable c : countables) {
            if (c instanceof Bird) {
                ((Bird) c).fly();
            } else if (c instanceof Tree) {
                return;
            }
        }
	}

}
