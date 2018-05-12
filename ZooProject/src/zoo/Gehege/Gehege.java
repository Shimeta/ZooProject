package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public abstract class Gehege {

	private String name;
	private Zoo owner;
	protected Tier[] tiere = new Tier[10];
	public int tier_array_index;
	protected int Gehege_typ;
	
	public Gehege(String name, Zoo owner) {
		this.setName(name);
		this.owner = owner;
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

	public abstract void setTiere(Tier[] tiere);
	public abstract void addTier(Tier tier);


	public Zoo getOwner() {
		return owner;
	}


	public void setOwner(Zoo owner) {
		this.owner = owner;
	}
	
}
