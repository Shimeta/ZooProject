package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class Vogelgehege extends Gehege {

	public Vogelgehege(String name, Zoo owner) {
		super(name, owner);
		this.Gehege_typ = 1;
	}

	public void setTiere(Tier[] tiere) {
		//Array von Tieren werden hier Ã¼bergegeben
		//Hier muss noch eingeschrÃ¤nkt werden ... also dass z.B nur VÃ¶gel dem Vogelgehege zugeordnet werden dÃ¼rfen
		
		this.tiere = tiere;
		
		this.tier_array_index = tiere.length;
		
		for(int i = 0; i< tiere.length; i++) {
			
			System.out.println(tiere[i].getName()+" wurde dem "+this.getName()+ " zugeordnet");
		}
	}
	
	public void addTier(Tier tier) {
		int tiere_array_counter = 0;
		for(int l= 0; l< this.tiere.length; l++) {
			if(this.tiere[l] != null) {	
				tiere_array_counter++;
			}
		}
		
		this.tiere[tiere_array_counter] = tier;
		System.out.println(tier.getName()+ " wurde dem "+ this.getName()+" zugeordnet");
		
		
	}
	}
