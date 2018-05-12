
package zoo.Tier;

import zoo.Personen.Personal; //Personal muss dann die methoden in tier nutzen also tier.fÃ¼ttere(personal) beispielweise
import zoo.Zoo; //damn Tier spricht ja auch mit Zoo ohh
import zoo.Gehege.Gehege; //Tier greift dann auf Gehege zu

public interface ITier {

	public String getName();
	public void setName(String name);
	public Zoo getZoo();
	public void setZoo(Zoo zoo);
	
	public void fuettere(Personal personal); //implemented. Gibt aus, dass tier von personal gefÃ¼ttert wird.
	public void lebtIn(Gehege gehege);
		
}
