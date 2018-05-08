package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public abstract class Gehege {

	private String name;
//	private Zoo owner;
	protected Tier[] tiere;
	public int tier_array_index;
	
	public Gehege(String name, Zoo owner) {
		this.setName(name);
//		this.owner=owner;
		//Array von tieren ist pro Gehege maximal 10
		//wird beim erstellen direkt initialisiert
		//man muss dann die Tier über einen Array mit setTiere diesem Array zuordnen
		this.tiere= new Tier[10];
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Tier[] getTiere() {
		return tiere;
	}


	public abstract void setTiere(Tier[] tiere);
	public abstract void addTier(Tier tier);
	
}


