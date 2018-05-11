package zoo.Tier;

import zoo.Zoo;
//import zoo.Gehege.Gehege;

public class Zebra extends LandsaeugeTier{

	public Zebra(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Zebra";
		System.out.println("Das Zebra "+ name+ " wurde erstellt");
	}

}
