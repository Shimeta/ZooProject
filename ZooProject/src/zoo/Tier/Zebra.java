package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Zebra extends LandsaeugeTier{

	public Zebra(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		this.TypName="Zebra";
		System.out.println("Das Zebra "+ name+ " wurde erstellt");
	}

}
