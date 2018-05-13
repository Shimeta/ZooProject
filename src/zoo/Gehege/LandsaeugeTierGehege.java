package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class LandsaeugeTierGehege extends Gehege {
	

	public LandsaeugeTierGehege(String name, Zoo owner) {
		super(name, owner);
		this.Gehege_typ = 2;
	}
	public void setTiere(Tier[] tiere) {
		//Array von Tieren werden hier übergegeben
		//Hier muss noch eingeschränkt werden ... also dass z.B nur Vögel  Vogelgehege zugeordnet werden dürfen

		
		this.tiere = tiere;
		
		for(int i = 0; i < tiere.length; i++) {
			
			System.out.println(tiere[i].getName()+" wurde dem " + this.getName() + " zugeordnet");
		}
	}
	
}

