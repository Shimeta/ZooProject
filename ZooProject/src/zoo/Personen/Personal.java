package zoo.Personen;

import zoo.Zoo;
import zoo.Gehege.Gehege;
//import zoo.Tier.Tier;		//frag mich ob personal das benutzen müsst also wegen ITier & lebtin
import zoo.Tier.ITier;

public class Personal extends Personen {

	private Zoo arbeitsplatz; // Name kann nur wieder ausgegeben werden
	private int betreut_gehege_id;
	
	public Personal(String name,Zoo arbeitsplatz,Gehege[] gehege){
		super(name,gehege);
		setArbeitsplatz(arbeitsplatz);
		arbeitsplatz.addAngestellte(this);
		
	}
	
	
	//Personal kümmert sich jeweils um die Tiere die in den jeweilgen übergebene Gehegen leben
	//Bin mir nicht sicher ob das von der Aufgabenstellung so vorgesehen war...
	//weil in einem Aquarium zum Beispiel nur Wassertiere leben dürfen -> heißt dann dass der Angstellte sich nur um Wassertiere kümmert 
	
	public void setBetreuteTiere(int id) {
		this.betreut_gehege_id = id;
	}
	public int getBetreuteTiere() {
		return this.betreut_gehege_id; 
	}
	
	public void betreut(ITier tier) {
		if (tier.getGehege_typ()==this.betreut_gehege_id) {
			System.out.println("Personal " + getName() + " betreut bzw füttert nun " + tier.getClass().getSimpleName() + " " + tier.getName());
		} else {
			System.out.println("Personal " + getName() + " ist nicht für " + tier.getClass().getSimpleName() + " " + tier.getName() + "zuständig");
		}
		//JUCKT GIB IHM
    
		//Z.B es gibt 3 verschiedene Vogelgehege und jedes Vogelgehege hat jeweils andere Tiere
		//d.h jedes Vogelgehege wird durchgegangen und geschaut welches Tier da drin lebt
	  for(int k = 0; k< gehege_length;k++) {
		  for(int i = 0; i< gehege[k].getTiere().length ;i++) {
			  if(gehege[k] != null && gehege[k].getTiere()[i] != null) {
				  System.out.println(getName()+" betreut "+ gehege[k].getTiere()[i].getName());
			  }
		  }
	  }
  }
  
	public void setArbeitsplatz(Zoo arbeitsplatz) {
		this.arbeitsplatz = arbeitsplatz;
		System.out.println(this.getName() + " arbeitet jetzt bei "+ arbeitsplatz.getName());
	}
	public String getArbeitsplatzName() {
		return this.arbeitsplatz.getName();
	}
	
	public Gehege[] getGehege() {
	  return gehege;
	}


}
