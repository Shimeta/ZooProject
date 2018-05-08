package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Loewe extends LandsaeugeTier{

	public Loewe(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Loewe "+name+" wurde erstellt");
	}

}
