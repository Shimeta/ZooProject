package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Adler extends Vogel {

	public Adler(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Adler "+ name + " wurde erstellt");
		
	}
	
	

}
