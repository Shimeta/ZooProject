package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class Vogelgehege extends Gehege {

	public Vogelgehege(String name, Zoo owner) {
		super(name, owner);
		
	}

	public void setTiere(Tier[] tiere) {
		//Array von Tieren werden hier übergegeben
		//Hier muss noch eingeschränkt werden ... also dass z.B nur Vögel dem Vogelgehege zugeordnet werden dürfen
		
		this.tiere = tiere;
		
		this.tier_array_index = tiere.length;
		
		for(int i = 0; i< tiere.length; i++) {
			
			System.out.println(tiere[i].getName()+" wurde dem "+this.getName()+ " zugeordnet");
		}
	}
	
	public void addTier(Tier tier) {
		
		//setzt das Tier in den Array ein nur einmal 
		
	boolean anima_inside = false;
		
		for(int l= 0; l< this.tiere.length; l++) {
			
			if(this.tiere[l] == null && anima_inside == false) {
				
				this.tiere[l] = tier;
				
				anima_inside = true;
			}
		}

		
		System.out.println(tier.getName()+ " wurde dem "+ this.getName()+" zugeordnet");
		
		
	}


}
