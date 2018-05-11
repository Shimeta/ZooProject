package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public abstract class Vogel extends Tier{
	
	public Vogel(String name, int alter, Zoo zoo, Gehege gehege){
		super(name, alter, zoo, gehege);
	}

}
