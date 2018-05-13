package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public abstract class Gehege {

	private String name;
	private Zoo owner;
	protected Tier[] tiere;		//Zuordnung erfolgt über setTier
	/* = new Tier[10]; ja man kann das auch hier schreiben.
	* im Grunde ist es das selbe, aber im Konstruktor ist es einfach die Verbindung dann
	* zu sehen
	*/ 
	public int tier_array_index = 0; // TODO muss private werden
	protected int Gehege_typ;
	public int tier_counter = 0; // TODO muss private werden
	
	
	public Gehege(String name, Zoo owner) {
		this.setName(name);
		this.owner=owner;
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
	
	public int getGehege_typ() {
		return Gehege_typ;
	}
	
	public Zoo getOwner() {
		return owner;
	}
	//setOwner wird nicht gebraucht, da es nicht möglich ist ein Gehege einfach so zu
	//"verpflanzen" meiner Meinung nach	

	public abstract void setTiere(Tier[] tiere);
	public abstract void addTier(Tier tier);
	
}
