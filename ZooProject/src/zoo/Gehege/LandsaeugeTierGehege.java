package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class LandsaeugeTierGehege extends Gehege {
	

	public LandsaeugeTierGehege(String name, Zoo owner) {
		super(name, owner);
		this.Gehege_typ = 2;
	}
	public void setTiere(Tier[] tiere) {
		//Array von Tieren werden hier Ã¼bergegeben
		//Hier muss noch eingeschrÃ¤nkt werden ... also dass z.B nur VÃ¶gel  Vogelgehege zugeordnet werden dÃ¼rfen

		
		this.tiere = tiere;
		
		for(int i = 0; i < tiere.length; i++) {
			
			System.out.println(tiere[i].getName()+" wurde dem " + this.getName() + " zugeordnet");
		}
	}
	
	public void addTier(Tier tier) {
		//ein einzelnes Tier wird hinzugefÃ¼gt zum Gehege
		//muss auch noch eingeschrÃ¤nkt werden ~> isses nun o/
		//ich wÃ¼rds so machen
		if((tier.getTypName()=="Loewe") || (tier.getTypName()=="Zebra")) {
			//kann zugeordnet werden
			//referenz: System.out.print("\n " + tier.getTypName());
			
			int tiere_array_counter = 0;
			for(int l= 0; l< this.tiere.length; l++) {
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
