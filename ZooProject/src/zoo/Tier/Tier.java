package zoo.Tier;

import zoo.Personen.Personal;
import zoo.Zoo;
import zoo.Gehege.Gehege;

public abstract class Tier implements ITier{

	private String name;
	private int alter;
	private Zoo zoo;
	private Gehege gehege;
	protected String TypName;
	
	
	public Tier(String name, int alter, Zoo zoo, Gehege gehege) {
		this.setName(name);
		this.alter = alter;
		this.setZoo(zoo);
		this.gehege = gehege;
		
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
		System.out.println(this.name + " wird von " + personal.getName() + " gefüttert.");
	}
	
	//sehe es wurd mit addTier geregelt
	public void lebtIn(/*String Gehege, Gehege neuesGehege, */Gehege gehege) { //Assoziation wenn mich nicht alles täuscht
		System.out.print(this.name + " lebt im Gehege " + gehege.getName());
	}
	
	/*
	 * viele methoden die hier aufgerufen werden müssen noch implementiert werden bzw
	 * von meinem Code übernommen, werden allerdings will ich die differenzen im git 
	 * erstmal klein haben, weil es halt auch einfacher zu reviewen ist dswg ist hier
	 * alles erstmal ein Kommentar
	 * nicht gefragt
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
