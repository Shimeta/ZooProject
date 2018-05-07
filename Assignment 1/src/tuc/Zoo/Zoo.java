package tuc.Zoo;

import tuc.Zoo.Gehege.*;
import tuc.Zoo.Personen.*;
import tuc.Zoo.Tier.*;

public class Zoo {
	//Vars allg:
	public String Name;					//Name des Zoos
	private final int Gehege_Kapazität;	//Max Tiere pro Gehege
	private final int Gehegenanzahl;	//Max Anzahl an Gehegen
	public Gehege[] Reviere;

	//Personalstuff
	private int Personal_Anzahl;  	//könnt man sich fast sparen durch die IDs aber naja braucht man dann doch
	private Personal[] angestellte; // Rolle aus Aufgabe [] da unendlich | Namen der Angestellten
	private int[] taken_IDs;		//benötigt für ID-Nummern der Mitarbeiter
	private int ID_count=0;			//benötigt für das richtige hinzufügen von Mitarbeitern(am Ende des Arrays)

	//Tierzeugs
	private int Tier_Anzahl=0;
	private Tier[] tiere;
	private int[] taken_tier_IDs;
	private int ID_Tier_count=0;

	//Constructor
	public Zoo(String name, final int gehege_kapazität, final int gehege_anzahl, final int personal) {
		if (name=="") {
			System.out.println("Achtung! Ihr Zooname ist nun leer");	//Error
		}
		this.Name=name;
		this.Gehegenanzahl=gehege_anzahl;
		this.Gehege_Kapazität=gehege_kapazität;
		this.Personal_Anzahl=personal;
	}
	
	
	//finished methods
	public String zeigNamen() {
		if(this.Name==null) {
			System.out.println("Ihr Zoo hat einen leeren Namen!");		//Error
			return this.Name;
		} else {
			return this.Name;
		}
	}
	public void ändereNamen(String name) {
		if(name==null) {
			System.out.println("Kein Name eingegeben!");				//Error
		} else if(name=="") {
			System.out.println("Achtung! Ihr Zooname ist nun leer");	//Error
			this.Name=name;
		} else {
			this.Name=name;
		}
	}
	
	public final int getGehegeKapazität() {
		return this.Gehege_Kapazität;
	}
	public final int getGehegeAnzahl() {
		return this.Gehegenanzahl;
	}
	
	public int zeig_PersonalAnzahl() {
		return this.Personal_Anzahl;
	}
	public void erhöhe_PersonalAnzahl() {
		Personal_Anzahl++;
	}
	public void erniedrige_PersonalAnzahl() {
		Personal_Anzahl--;
	}
	
	public void print_angestellte() {
		if(this.angestellte==null) {
			System.out.println("Der Zoo hat noch keine Angestellten");
			return;
		} else { 
			for(int i=0;i<this.Personal_Anzahl;i++) {
				System.out.println(this.angestellte[i]);
			}
		}
	}
	public void addAngestellte(Personal angestellter,int ID){
		for(int i=0;i<taken_IDs.length;i++) {
			if(taken_IDs[i]==ID) {
				System.out.println("Konnte Angestellten nicht hinzufügen(" + ID + ") ist schon in Verwendung");
				return ;
			} else if(i>=this.Personal_Anzahl) { //überschreitet maximale Personalanzahl
				System.out.println( "Der Zoo kann keine weiteren Angestellten anwerben," +
									" da bereits alle Stellen voll sind(" + this.angestellte.length +
									"/" + this.Personal_Anzahl + ")");
			}
		}
		this.angestellte[ID]=angestellter;
	}
	
	public void takeID(int ID) {
		this.taken_IDs[ID_count]=ID;
		ID_count++;
	}
	public void print_takenIDs() {
		if(this.taken_IDs==null) {
			System.out.println("Es gibt noch kein Personal in diesem Zoo.");
		} else { 
			System.out.print("Personalliste: ");
			for(int i=0;i<this.taken_IDs.length;i++) {
				System.out.print(this.taken_IDs[i] + " ");
			}
			System.out.println("");
		}
	}

	public void print_Details() {
		System.out.println("Name: " + this.Name);
		System.out.println("Gehegenanzahl: " + this.Gehegenanzahl);
		System.out.println("Maximale Tiere pro Gehege: "+ this.Gehege_Kapazität);
		System.out.println("Mitarbeiteranzahl: " + this.Personal_Anzahl);
		print_takenIDs();
	}
	
}