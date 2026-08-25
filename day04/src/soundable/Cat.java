package soundable;

public class Cat implements Soundable {
	
	String cat;


	public Cat(String cat) {
		this.cat = cat;
	}


	@Override
	public String sound() {
		
		return cat;
	}



}
