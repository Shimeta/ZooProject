//unfinished

package tuc.Zoo.Tier;
import tuc.Zoo.Zoo;
import tuc.Zoo.Gehege.Gehege;
import tuc.Zoo.Personen.ITier;
import tuc.Zoo.Personen.Personal;

public abstract class Tier implements ITier{
	
	private final String Name;
	private String Gehege;		//aktuelles Habitat
	
	
	public Tier(String name) {
		this.Name=name;
	}
	
	//finished Methods
	public String lebtGeradeIn() {		//get this.gehege
		return this.Gehege;	
	}
	public String showName() { 			//get this.name
		return this.Name;
	}
	
	//		interface method
	public void füttere(Tier tier,Personal personal){
		System.out.println(this.Name + "wird von" + personal.getPersonenNamen() + "gefüttert.");
	}
	
	//unfinished Methods
	public void lebtIn(String gehege, Gehege neuesGehege, Gehege altesGehege, Zoo zuu) { //set this.gehege
		if(neuesGehege.isfull(zuu)==false) {
			this.Gehege=gehege;
			if(altesGehege.getBewohneranzahl()<=0){
				/* do nothing */
			} else {
				altesGehege.erniedrige_Bewohneranzahl();
			}
			neuesGehege.erhöhe_Bewohneranzahl();
			altesGehege.removeBewohner(this);
			neuesGehege.addBewohner(this);
		}
	}
}
