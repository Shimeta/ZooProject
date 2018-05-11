package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Loewe extends LandsaeugeTier{

	public Loewe(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Loewe";
		System.out.println("Der Loewe "+name+" wurde erstellt");
		this.Raubtier = true;
	}
}
