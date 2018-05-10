package zoo.Tier;

import zoo.Personen.Personal;
import zoo.Zoo;
import zoo.Gehege.Gehege;

public abstract class Tier implements ITier{

	private String name;
	protected int Gehege_typ;
	private Zoo zoo;
	private Gehege gehege;
	protected boolean Raubtier;
	protected String TypName;

	
	
	public Tier(String name, Zoo zoo) {
		this.setName(name);
		this.Gehege_typ = Gehege_typ;
		this.setZoo(zoo);
		this.Raubtier = false;
		
	}

	////////Methods from Interface ITier
	public String getName() {
		return name;
	}
	public String getTypName() {
		return TypName;
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
	
	public void fuettere(Personal personal){
		System.out.println(this.name + " wird von " + personal.getName() + " gefuettert.");
	}
	
	//sehe es wurd mit addTier geregelt
	public void lebtIn(/*String Gehege, Gehege neuesGehege, */Gehege gehege) { //Assoziation wenn mich nicht alles täuscht
		System.out.print(name + " lebt im Gehege " + gehege.getName());
	}
	
	public int getGehege_typ() {
		return this.Gehege_typ;
	}
	
	public boolean isRaubtier() {
		return this.Raubtier;
	}

	public Gehege getGehege() {
		return gehege;
	}

	public void setGehege(Gehege gehege) {
		this.gehege = gehege;
	}
	
	/*
	 * viele methoden die hier aufgerufen werden müssen noch implementiert werden bzw
	 * von meinem Code übernommen, werden allerdings will ich die differenzen im git 
	 * erstmal klein haben, weil es halt auch einfacher zu reviewen ist dswg ist hier
	 * alles erstmal ein Kommentar
	 * nicht gefragt
	 * 
	 * 
		if(neuesGehege.isfull(zuu)==false) {
			this.gehege=Gehege;
			if(altesGehege.getBewohneranzahl<=0){
				// do nothing 
			} else {
				altesGehege.erniedrige_Bewohneranzahl();
				altesGehege.removeBewohner(this);
			}
			
			neuesGehege.erhöhe_Bewohneranzahl();
			altesGehege.removeBewohner(this);
			neuesGehege.addBewohner(this);
	*/
}
