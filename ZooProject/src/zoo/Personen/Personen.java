package zoo.Personen;

import zoo.Gehege.Gehege;
//import zoo.Tier.Tier;
//import zoo.Tier.ITier; not used yet

public abstract class Personen {
	
	private String name;
	private int alter;
	private Gehege gehege;	
	
	
	public Personen(String name,int alter) {
	this.setName(name);
	this.alter = alter;
	
	}


	
	///////name
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}


	public Gehege getGehege() {
		return gehege;
	}


	public void setGehege(Gehege gehege) {
		this.gehege = gehege;
	}
	
	
	
	
	
	

}