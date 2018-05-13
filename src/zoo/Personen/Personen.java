package zoo.Personen;

import zoo.Gehege.Gehege;


public abstract class Personen {
	
	private String name;	
	
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



	
	
	
	
	
	

}
