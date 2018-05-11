package zoo;

import zoo.Gehege.Aquarium;
import zoo.Gehege.LandsaeugeTierGehege;
import zoo.Gehege.Vogelgehege;
import zoo.Personen.Personal;
import zoo.Tier.Tier;

public class Zoo {
	
	private String name;
	private static int gehege_count_array = 0; //zählt ab ob max Gehege erreicht wurden
	
	private Vogelgehege[] vogelgehege;
	private LandsaeugeTierGehege[] landsaeugetiergehege;
	private Aquarium[] getAquarium;
	
	private Tier[] tiere;
	private Personal[] angestellte;
	
	
	public Zoo(String name, Tier[] tiere, Personal[] angestellte) {
		
		this.setName(name);
		this.setTiere(tiere);
		this.setAngestellte(angestellte);
		
		this.vogelgehege = new Vogelgehege[10];
		this.landsaeugetiergehege = new LandsaeugeTierGehege[10];
		this.getAquarium = new Aquarium[10];
		System.out.println("Zoo '" + this.getName() + "' wurde erstellt.");
		}
		
	/////name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	//////Personal
	public Personal[] getAngestellte() {
		return angestellte;
	}
	public void setAngestellte(Personal[] angestellte) {
		this.angestellte = angestellte;
	}
	
	////////Tier zuordnen
	public Tier[] getTiere() {
		return tiere;
	}
	public void setTiere(Tier[] tiere) {
		this.tiere = tiere;
	}
	
	//getGehegeEinträge
	public Vogelgehege getVogelgehege(int i) {
		return this.vogelgehege[i];
	}
	public LandsaeugeTierGehege getLandsaeugetiergehege(int i) {
		return this.landsaeugetiergehege[i];
	}
	public Aquarium getAquarium(int i) {
		return this.getAquarium[i];
	}
	//getLists
	public Vogelgehege[] getVogelgehegeList() {
		return this.vogelgehege;
	}
	public LandsaeugeTierGehege[] getLandsaeugetiergehegeList() {
		return this.landsaeugetiergehege;
	}
	public Aquarium[] getAquariumList() {
		return this.getAquarium;
	}
	
	//Die einzelnen Gehege werden als Komposition erstellt -> also abhängig von Zoo
	//wenn gehege_count bis 10 hochgezählt hat sagt er am Ende Bescheid
	
	private int checkiffull(int AnzahlvonGehegen) {
		/*
		* TODO: eigentlich müsste man hier exceptions werfen,
		*		aber da bin ich noch zu unbelesen und im Grunde ist es nicht gefragt dswg juckt
		*		patch:	10.5.18 -> Ich habs jetzt mal in der mir bekannten C weise gelöst(mit Nummern) -- Norbert
		*				Es ist ein Workaround, aber eigentlich nicht gut, da wenn diese Funktion fehlschlägt die anderen
		*				immernoch funktionieren, aber halt nichts machen.
		*/
		if (AnzahlvonGehegen > 9) {
			System.err.println("Es können nicht mehr als 10 Gehege angelegt werden");
			return -1;
		} else if (gehege_count_array >= 9 ) {
			System.err.println("Es können keine Gehege mehr angelegt werden, da die maximale Anzahl erreicht wurde ("
					+ gehege_count_array + "/" + "10)");
			return -1; 
		} else if ((gehege_count_array + AnzahlvonGehegen) > 9) { // ist überhaupt genug platz noch da?
			System.err.println("Das Anlegen dieser Anzahl an neuen Gehegen ist unzulässig. Es können allerdings noch "
					+ (10 - gehege_count_array) + " Gehege angelegt werden.");
			return -1;
		}
		return 0;
	}
	
	
	public void setVogelgehege(String[] name, Zoo zoo, int vogel_gehege_count) {
		if(checkiffull(vogel_gehege_count)!=0) {
			return ; 
		} else {
		//okay: es gilt: gc < 10 && vgc <= 10
			
			for (int i = 0; i < vogel_gehege_count; i++) {
				if (gehege_count_array < 9) {
					gehege_count_array++; // letzter durchlauf = 10
					this.vogelgehege[i] = new Vogelgehege(name[i], zoo);
					System.out.println(	this.name + " hat jetzt ein neues Vogelgehege mit der Bezeichnung '" 
										+ name[i] + "'");

				} else if (gehege_count_array == 9) {	
					System.out.println("Maximale Gehegeanzahl wurde erreicht.");
					
				} else {
					System.err.println(this.name + " hat die maximale Gehegeanzahl erreicht ("
							+ (gehege_count_array + 1) + "/10)");
					System.err.println("Es wurden keine neuen Gehege angelegt");
					break;
					
				}
			}
		}
	}
	
	public void setLandsaeugeTierGehege(String[] name, Zoo zoo, int landsaeuge_gehege_count) {
		if (checkiffull(landsaeuge_gehege_count) != 0) {
			return;
		} else {
			for (int i = 0; i < landsaeuge_gehege_count; i++) {
				if (gehege_count_array < 9) {
					gehege_count_array++; // letzter durchlauf = 10
					this.landsaeugetiergehege[i] = new LandsaeugeTierGehege(name[i], zoo);
					System.out.println(this.name + " hat jetzt ein neues Landsaeugetiergehege mit der Bezeichnung '"
							+ name[i] + "'");

					if (gehege_count_array == 9) {
						System.out.println(this.name + " hat die max Gehegeanzahl erreicht");
						break;
					}
				}
			}
		}
		
	}

	public void setAquarium(String[] name, Zoo zoo, int aqua_gehege_count) {

		if (checkiffull(aqua_gehege_count) != 0) {
			return;

		} else {
			for (int i = 0; i < aqua_gehege_count; i++) {
				if (gehege_count_array < 9) {
					this.getAquarium[i] = new Aquarium(name[i], zoo);
					System.out.println(
							this.name + " " + "hat jetzt ein neues Aquarium mit der Bezeichnung '" + name[i] + "'");
					gehege_count_array++;

					if (gehege_count_array == 9) {
						System.out.println(this.name + " " + "hat die max Gehegeanzahl erreicht");
						break;
					}
				}
			}
		}
	}
	
	
	public void outputZustand() {		

		//Platzhalter
		System.out.println();
		
		//Zustand des Vogelgeheges
		for(int p = 0; p< vogelgehege.length; p++) {
			if(vogelgehege[p] != null) {
				System.out.print(this.name+" hat das Gehege "+ this.vogelgehege[p].getName());

				System.out.print(" darin leben ");
				//Jedes Tier im Vogelgehege wird durchgegangen ... allerdings wird zuerst geschaut
				//ob da überhaupt Tiere drinnen sind
				for(int k = 0; k<vogelgehege[p].getTiere().length; k++) {
					if(vogelgehege[p].getTiere()[k] != null) {
						System.out.print( vogelgehege[p].getTiere()[k].getName()+", ");
					}
				}
				//am ende eines Geheges wird untendrunter weitergeschrieben
				System.out.println();
			}
		}
		
		// Zustand des LandsaeugeTierGeheges
		for (int p = 0; p < landsaeugetiergehege.length; p++) {
			if (landsaeugetiergehege[p] != null) {

				System.out.print(this.name + " hat das Gehege " + this.landsaeugetiergehege[p].getName());

				System.out.print(" darin leben ");

				// Jedes Tier im Vogelgehege wird durchgegangen ... allerdings wird zuerst
				// geschaut
				// ob da überhaupt Tiere drinnen sind

				for (int k = 0; k < landsaeugetiergehege[p].getTiere().length; k++) {

					if (landsaeugetiergehege[p].getTiere()[k] != null) {

						System.out.print(landsaeugetiergehege[p].getTiere()[k].getName() + ", ");
					}

				}

				// am ende eines Geheges wird untendrunter weitergeschrieben
				System.out.println(" ");

			}
		}

		// Zustand des Aquariums
		for (int p = 0; p <  getAquarium.length; p++) {
			if (getAquarium[p] != null) {

				System.out.print(this.name + " hat das Gehege " + this.getAquarium[p].getName());

				System.out.print(" darin leben ");

				// Jedes Tier im Vogelgehege wird durchgegangen ... allerdings wird zuerst
				// geschaut
				// ob da überhaupt Tiere drinnen sind

				for (int k = 0; k < getAquarium[p].getTiere().length; k++) {

					if (getAquarium[p].getTiere()[k] != null) {

						System.out.print(getAquarium[p].getTiere()[k].getName() + ", ");
					}

				}

				// am ende eines Geheges wird untendrunter weitergeschrieben
				System.out.println(" ");

			}
		}

		// angestellte Zustand und wo sich welches Personaal wo befindet

		for (int arb = 0; arb < angestellte.length; arb++) {

			System.out.println(this.name + " hat den Angestellten " + angestellte[arb].getName()
					+ " ,welcher sich um folgende Gehegen kümmert: ");
			for (int g = 0; g < angestellte[arb].getGehege().length; g++) {
				if (angestellte[arb].getGehege()[g] != null) {

					System.out.print(angestellte[arb].getGehege()[g].getName() + ", ");

				}

			}
			System.out.println(" ");
		}
		// Besucher wo die sich aufhalten
		System.out.println();
	}
}
