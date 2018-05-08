package zoo.Tier;

import zoo.Personen.Personal;
import zoo.Zoo;
import zoo.Gehege.Gehege;

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

////////Methods from Interface ITier
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
	
	public void fuettere(Personal personal){
		System.out.println(this.name + " wird von " + personal.getName() + " gefüttert.");
	}
	
	/** bin mir unsicher über die Methode braucht noch n bisschen Refactoring
	 * zieht ein Tier in ein neues Gehege um, während es das Tier aus dem alten Gehege entfernt
	 * und die stelle in der das Tier in der Liste stand null setzt.
	 * Erhöht auch die Bewohneranzahl im neuen Gehege und erniedrigt sie im alten Gehege falls sie über 0 ist.
	 * 
	 * @see zoo.Tier.ITier#lebtIn(java.lang.String, zoo.Gehege.Gehege, zoo.Gehege.Gehege, zoo.Zoo)
	 * 
	 * okay das braucht etwas mehr Zeit...
	 * 
	 * */
	public void lebtIn(String Gehege, Gehege neuesGehege, Gehege altesGehege, Zoo zuu) { 
	/*
	 * viele methoden die hier aufgerufen werden müssen noch implementiert werden bzw
	 * von meinem Code übernommen, werden allerdings will ich die differenzen im git 
	 * erstmal klein haben, weil es halt auch einfacher zu reviewen ist dswg ist hier
	 * alles erstmal ein Kommentar
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
	*/}
}
