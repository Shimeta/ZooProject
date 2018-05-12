package zoo.Tier;

import zoo.Zoo;

public class Adler extends Vogel {

	public Adler(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Adler";
		System.out.println("Der Adler "+ name + " wurde erstellt");
		this.Raubtier = true;
	}
	
	

}
