package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public abstract class Gehege {

	private String name;
	private Zoo owner;
	private Tier[] tiere = new Tier[10];
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

	public void setTiere(Tier[] tiere) {
		this.tiere = tiere;
	}

	public boolean addTier(Tier tier) {
		if(this.isGeeignet(tier)==true) {
			
			int tiere_array_counter = 0;
			for(int l= 0; l< this.tiere.length; l++) {
				if(this.tiere[l] != null) {	
					tiere_array_counter++;
				}
			}
			
			this.tiere[tiere_array_counter] = tier;
			System.out.println(tier.getName()+ " wurde "+ this.getName()+" zugeordnet");
			return true;
		}
		System.out.println(tier.getName()+ " konnte nicht "+ this.getName()+" zugeordnet werden ");
		return false;
	}
		
	
	private boolean isGeeignet(Tier tier) {
		boolean allowed = true;
			//BSP: Zebra kann nicht in Löwengehege und Löwe nicht in Zebragehege
			
				for(int k = 0; k < this.getTiere().length; k++) {
					if(this.getTiere()[k] != null) {
						if(this.getTiere()[k].isRaubtier() != tier.isRaubtier()) {
							allowed = false;
						}
					}
				}

				if(this.getGehege_typ() != tier.getGehege_typ()) {
					allowed=false;
				}
		return allowed;
	}
	
	public Zoo getOwner() {
		return owner;
	}


	public void setOwner(Zoo owner) {
		this.owner = owner;
	}



	public boolean isInsideGehege(Tier tier) {
		boolean isInsideGehege = false;
		for(int p = 0; p < this.getTiere().length; p++) {
			if(this.getTiere()[p] != null) {
				if(this.getTiere()[p].getName() == tier.getName()) {
					isInsideGehege = true;
				}
			}
		}
		return isInsideGehege;
	}
	
}


