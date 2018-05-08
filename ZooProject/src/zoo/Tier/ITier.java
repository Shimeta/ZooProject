/**
 * merged with Norberts files
 * import zoo.Tier braucht man nicht da es eh von package tier übernommen wird
 */ 
package zoo.Tier;

//verbindungen mit:
import zoo.Personen.Personal; //Personal muss dann die methoden in tier nutzen also tier.füttere(personal) beispielweise
import zoo.Zoo; //damn Tier spricht ja auch mit Zoo ohh
import zoo.Gehege.Gehege; //Tier greift dann auf Gehege zu

/**
 * @author Phahou(Norbert)
 * added methods fuettere and lebtIn
 * fuettere is implemented lebtIn needs a bit more refactoring so we'll see
 */

public interface ITier {

	public String getName();
	public void setName(String name);
	public Zoo getZoo();
	public void setZoo(Zoo zoo);
	
	public void fuettere(Personal personal); //implemented. Gibt aus, dass tier von personal gefüttert wird.
	public void lebtIn(String gehege, Gehege neuesGehege, Gehege altesGehege, Zoo zuu); //implemented
		
}