package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Walhai extends WasserTier{

	public Walhai(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		this.TypName="Walhai";
		System.out.println("Der Walhai " + name +" wurde erstellt");
		
	}

}
