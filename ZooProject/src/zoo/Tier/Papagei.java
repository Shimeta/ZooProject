package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class Papagei extends Vogel{

	public Papagei(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		this.TypName="Papagei";
		System.out.println("Der Papagei"+ " "+name+" "+"wurde erstellt");
	}

	
}
