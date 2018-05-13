package zoo.Personen;

import zoo.Zoo;
import zoo.Gehege.Gehege;
import zoo.Tier.Tier;		//frag mich ob personal das benutzen m√ºsst also wegen ITier & lebtin

public class Personal extends Personen {

	private Zoo arbeitsplatz;
	private Gehege[] gehege;
	
	
	public Personal(String name,Zoo arbeitsplatz,Gehege[] gehege){
		super(name,gehege);
		this.arbeitsplatz = arbeitsplatz;
		this.gehege = gehege;
		this.arbeitsplatz.addAngestellte(this);
		//geht alle elmente im gehegearray durch
		for(int i = 0; i < gehege.length && gehege[i] != null; i++) {
			//geht f¸r jedes Gehege alle Tiere durch
			for(int k = 0; k < gehege[i].getTiere().length; k++) {
				if(gehege[i].getTiere()[k] != null) {
					System.out.println(this.getName()+" betreut "+ gehege[i].getTiere()[k].getTypName()+" :"+gehege[i].getTiere()[k].getName());
				}
			}
		}
	}
	
	
	//Personal k¸mmert sich jeweils um die Tiere die in den jeweilgen ¸bergebene Gehegen leben
	//Bin mir nicht sicher ob das von der Aufgabenstellung so vorgesehen war...
	//weil in einem Aquarium zum Beispiel nur Wassertiere leben d¸rfen -> heiﬂt dann dass der Angstellte sich nur um Wassertiere k¸mmert 
	
	public void betreut(Gehege[] gehege) {
		setGehege(gehege);
		//schaut bei dem ¸bergebenen gehegearray wann nichts mehr drinne steht(null)
		//weil zu Beginn ja mit der L‰nge 10 initialisiert war(siehe -> Gehege Konstruktor)
		int gehege_length = 0;
		for(int p= 0; p<gehege.length;p++) {
			if(gehege[p] != null) {
				gehege_length++;
			}	
		}
		
		//Z.B es gibt 3 verschiedene Vogelgehege und jedes Vogelgehege hat jeweils andere Tiere
		//d.h jedes Vogelgehege wird durchgegangen und geschaut welches Tier da drin lebt
	for(int k = 0; k< gehege_length;k++) {
		
		for(int i = 0; i< gehege[k].getTiere().length ;i++) {
			
			if(gehege[k] != null && gehege[k].getTiere()[i] != null) {
				System.out.println(getName()+" betreut "+ gehege[k].getTiere()[i].getName());
			}
			
		}
		
	}
		
		
	}
	
	public void nullGehegeAtIndex(String Bezeichnung) {
		for(int i = 0; i < this.gehege.length; i++) {
			if(this.gehege[i] != null) {
				if(this.gehege[i].getName() == Bezeichnung) {
					this.gehege[i] = null;
				}
			}
		}
	}
	
	public void setGehege(Gehege[] gehege) {
		this.gehege = gehege;
	}
	
	public Gehege[] getGehege() {
		
	return gehege;
	}




	
	
}