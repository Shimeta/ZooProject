//TODO: <<use>> ITier interface for interaction with type Tier

package tuc.Zoo.Personen;
import tuc.Zoo.*;


public final class Personal extends Personen{
	private String arbeitsplatz; 	//local on Personal
	private int PersonalID; 		//ArrayElement needed for searching the name of the worker
	
	//finished Methods
	public Personal(String name) {
		super(name);
	}
	public void print_Details(){
		System.out.println("Name: " + this.Name);
		System.out.println("PersonalID: " + this.PersonalID);
		System.out.println("Angestellt in: " + this.arbeitsplatz);
		if (this.gehege==null) {
			this.gehege="Besucht derzeit kein Gehege";
		} else {
			System.out.println("Besucht gerade: " + this.gehege);
		}
	}
	
	//unfinished Methods
	//Anstellung bzw registierung im Typ Zoo
	public void wirdAngestellt(Zoo zoo,int personalID) {
		if(personalID==zoo.zeig_PersonalAnzahl()) {
			zoo.erhöhe_PersonalAnzahl();
			this.arbeitsplatz=zoo.zeigNamen();
			this.PersonalID=personalID;
		} else {
			System.out.println("ID-Nummer ist nicht verfügbar");
			System.out.println("Vergfügbar wäre " + zoo.zeig_PersonalAnzahl() + "(Notiz: IDs fangen bei 0 an und werden addiert");
		}
	}



	//Interface ITier
	

}
