//unfinished
package tuc.Zoo.Personen;
import tuc.Zoo.Gehege.Gehege;

public abstract class Personen {
	
	//Class variable(?) not sure if called so
	protected String Name;
	protected String gehege;

	//Constructor
	public Personen(String name) {
		this.Name=name;
	}
	
	//finished Methods
	public String getPersonenNamen() {
		return this.Name;
	}
	public String aktuellBesuchend() {
		return this.gehege;
	}
	
	//unfinished Methods
	//Set/Get gehege Gerichtete Assoziation (Einweg)
	public void besucht(Gehege gehege) {
		System.out.println(this.Name + " besucht " + gehege.getBezeichnung());
		System.out.println("Besucher " + this.Name + " steht am " + gehege.getBezeichnung() + " und sieht ");
		
		if (gehege.getBewohneranzahl()==0) {
			System.out.println("kein Tier.");
		}
		else if(gehege.getBewohneranzahl()>0) {
			switch(gehege.getTyp()) {
				case "Luft":
					System.out.print(gehege.getBewohneranzahl() + " ");
					break;
				case "Wasser":
					
					break;
				case "Land":
					
					break;
				default: /* do nothing*/
			}	
		}
	}
	

	//close enough I guess
}
