package zoo.Personen;

import zoo.Gehege.Gehege;
//import zoo.Tier.Tier;
//import zoo.Tier.ITier; not used yet

public abstract class Personen {
	
	private String name;
	private Gehege[] gehege; //TODO: Personen betreuen 	ist hier nicht erwünscht
							 // diese variable ist für den Ort der Person da (UML)
	
	
	public Personen(String name, Gehege[] gehege) {
		this.setName(name);
	}


	///////name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gehege[] getGehege() {
		return gehege;
	}

	public void setGehege(Gehege[] gehege) {
		this.gehege = gehege;
	}
	
	
	
}