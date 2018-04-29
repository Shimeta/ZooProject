package zoo;

interface ITier {
	public String getName();
	public void setName(String name);
	public Zoo getZoo();
	public void setZoo(Zoo zoo);
}

public abstract class Tier implements ITier{

	private String name;
	private int alter;
	private Zoo zoo;
	private Gehege gehege;
	
	
	public Tier(String name, int alter, Zoo zoo, Gehege gehege) {
		
		
		this.setName(name);
		this.alter = alter;
		this.setZoo(zoo);
		this.gehege = gehege;
		
		
	}

////////name
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	
}
