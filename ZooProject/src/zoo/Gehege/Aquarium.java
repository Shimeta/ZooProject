package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class Aquarium extends Gehege{
	
	public Aquarium(String name, Zoo owner) {
		super(name, owner);
		this.Gehege_typ = 3;
		
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
		//ein einzelnes Tier wird hinzugefügt zum Gehege
		//muss auch noch eingeschränkt werden ~> isses nun o/
		//ich würds so machen
		if((tier.getTypName()=="Walhai") || (tier.getTypName()=="Kugelfisch")) {
			//kann zugeordnet werden
			//referenz: System.out.print("\n " + tier.getTypName());
			
			int tiere_array_counter = 0;
			for(int l= 0; l< this.tiere.length; l++) { 	//schwierig wenn die liste 100
														//lang ist so wie in Zoo.java
														//angegeben
				if(this.tiere[l] != null) {	
					tiere_array_counter++;
				}
			}
			
			this.tiere[tiere_array_counter] = tier;
			System.out.println(tier.getName()+ " wurde "+ this.getName()+" zugeordnet");
		} 
		else {
			//krepiert elendig oder kann nicht zugeordnet werden
			System.out.println(tier.getTypName() + " konnte dem Gehege nicht zugeordnet werden (Grund: unpassendes Gehege");
		}
	}
	
}
