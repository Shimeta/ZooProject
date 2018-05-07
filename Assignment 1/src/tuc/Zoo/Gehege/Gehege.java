//unfinished
package tuc.Zoo.Gehege;

import tuc.Zoo.Zoo;
import tuc.Zoo.Tier.Tier;

public abstract class Gehege {
	private final String Bezeichnung;	//Wichtig für Besucher and no setter
	private int Bewohneranzahl=0;	//Wichtig für Besucher und umzüge
	private Tier[] Bewohner;
	private final String owner;
	
	protected String Typ;		//um später nachzuschauen ob das Tier das hier rein soll dort stirbt wegen falschem Habitat
	protected int BewohnergleichenTypsA;
	protected int BewohnergleichenTypsB;
	/* TODO: überprüfen ob man 2 eigene Listen weglassen kann (String[] BewohnerTypANamen String[] BewohnerTypBNamen).
	 * müsste eigentlich gehen, da man durch .getClass().getSimpleName() den Klassennamen herausfinden kann und das dann in ein if packt
	 */
	
	/* können maximal 2 typen von Tieren in einem dedizierten Gehege geben
	 * bspw können Papageien und Vögel im gleichen Gehege sein, aber keine Adler und Zebras, da sich die this.Typ dann unterscheiden würde (Luft, Land)
	 */
	
	public Gehege(String bezeichnung, Zoo zuu) { //Komposition wegen Typ Zoo -> Kein Zoo -> Konstruktor Gehege kann nicht aufgerufen werden -> Kein Gehege
		this.Bezeichnung = bezeichnung;
		this.owner=zuu.Name;
	}
	
	
	//finished Methods
	public String getBezeichnung() {
		return this.Bezeichnung;
	}
	public int getBewohneranzahl() {
		return this.Bewohneranzahl;
	}
	public String getowner() {
		return this.owner;
	}
	public void erhöhe_Bewohneranzahl() {
		this.Bewohneranzahl++;
	}
	public void erniedrige_Bewohneranzahl() {
		this.Bewohneranzahl--;
	}
	public void showBewohner() {
		System.out.println("Aktuelle Bewohner von " + this.Bezeichnung + " sind:");
		for (int i=0;i<Bewohneranzahl;i++) {
			System.out.println( "Bewohner[" + i + "]: " + this.Bewohner[i]);
			System.out.print( this.getClass().getSimpleName());
		}
	}
	public boolean isfull(Zoo zuu) { 			//checks if migration is even possible
		if (this.Bewohneranzahl>=zuu.getGehegeKapazität())	return true;
		else	return false;
	}
	public String getTyp() {
		return this.Typ;
	}
	public void printDetails() {
		System.out.println("Bezeichnung: " + Bezeichnung);
		System.out.println("Bewohneranzahl: " + Bewohneranzahl);
		System.out.println("owner: " + owner);
		System.out.println("Typ: " + this.Typ);
	}
	
	//unfinished Methods
	public void addBewohner(Tier neuesTier,Zoo zuu) {
		if (isfull(zuu)) { 
			//Attention! it is going to stderr
			System.err.println("Kann kein Tier mehr in dieses Gehege umsiedeln, da es bereits voll ist.");
		} else {
			if (this.Bewohneranzahl==0) {
				
			} else {
				this.Bewohneranzahl++;
				//search for first null in this.Bewohner[] and do this.Bewohner[firstoccourence]= neuesTier;
				
				this.Bewohner[search()] = neuesTier;

				System.out.println(neuesTier.showName() + " wurde erfolgreich dem Gehege" + this.Bezeichnung + " zugeordnet");
				
				
		}
	}
}
	private final int search(Tier tier) {
		int i;
		boolean foundsth=false;
		boolean doublename=false;
		for(i=0;i<=this.Bewohneranzahl;i++) {
			if((this.Bewohner[i]==null)&&(this.Bewohner[i].showName()!=tier.showName())) {
				foundsth=true;
				break;
			}
			else continue;
		}
		if(foundsth) System.err.println("Gehege ist voll"); //should never get here tho
		if(doublename) 
		return i;
	}
	public void removeBewohner(Tier altesTier) {
		this.Bewohneranzahl--;
		//search for Tier.Name in this.Bewohner[]
		
		this.Bewohner[i]=null;
	}

	
	
}
