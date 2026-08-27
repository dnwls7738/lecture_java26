package soundable;

public class Cat implements Soundable {
	
	String cat;


	public Cat(String cat) {
		this.cat = cat;
	}


	public String sound() {
		
		return cat;
	}



}
