package zoo;

import zoo.Gehege.Aquarium;
import zoo.Gehege.Gehege;
import zoo.Gehege.LandsaeugeTierGehege;
import zoo.Gehege.Vogelgehege;
import zoo.Personen.Personal;
import zoo.Tier.Tier;

public class Zoo {

	private String name;
	static boolean allowed = true; // schaut ob im Gehege das Tier reinplatziert werden darf oder nicht
//	private static int gehege_count_array = 0; // zählt ab ob max Gehege erreicht wurden

	/*
	 * private Vogelgehege[] vogelgehege; private LandsaeugeTierGehege[]
	 * landsaeugetiergehege; private Aquarium[] getAquarium;
	 */

	private Gehege[] gehege;
	public Tier[] tiere= new Tier[100];
	private Personal[] angestellte;
//	private int MAXIMALEANZAHLANANGESTELLTEN;

	static boolean freeSpaceBesucherArray = true;

	public Zoo(String name, Tier[] tiere, Personal[] angestellte) {

		this.setName(name);
		/*
		 * this.setTiere(tiere); this.setAngestellte(angestellte);
		 */
		gehege = new Gehege[10];
		/*
		 * this.vogelgehege = new Vogelgehege[10]; this.landsaeugetiergehege = new
		 * LandsaeugeTierGehege[10]; this.getAquarium = new Aquarium[10];
		 */
		System.out.println("Zoo '" + this.getName() + "' wurde erstellt.");
	}

	///// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	////// Personal
	public Personal[] getAngestellte() {
		return angestellte;
	}

	public void setAngestellte(Personal[] angestellte) {
		this.angestellte = angestellte;
	}

	//////// Tier zuordnen
	/*
	 * public Tier[] getTiere() { return tiere; } public void setTiere(Tier[] tiere)
	 * { this.tiere = tiere; }
	 */
	// getGehegeEinträge
	/*
	 * public Vogelgehege getVogelgehege(int i) { return this.vogelgehege[i]; }
	 * public LandsaeugeTierGehege getLandsaeugetiergehege(int i) { return
	 * this.landsaeugetiergehege[i]; } public Aquarium getAquarium(int i) { return
	 * this.getAquarium[i]; } //getLists public Vogelgehege[] getVogelgehegeList() {
	 * return this.vogelgehege; } public LandsaeugeTierGehege[]
	 * getLandsaeugetiergehegeList() { return this.landsaeugetiergehege; } public
	 * Aquarium[] getAquariumList() { return this.getAquarium; }
	 * 
	 * //Die einzelnen Gehege werden als Komposition erstellt -> also abhängig von
	 * Zoo //wenn gehege_count bis 10 hochgezählt hat sagt er am Ende Bescheid
	 * 
	 * private int checkiffull(int AnzahlvonGehegen) { /* TODO: eigentlich müsste
	 * man hier exceptions werfen, aber da bin ich noch zu unbelesen und im Grunde
	 * ist es nicht gefragt dswg juckt patch: 10.5.18 -> Ich habs jetzt mal in der
	 * mir bekannten C weise gelöst(mit Nummern) -- Norbert Es ist ein Workaround,
	 * aber eigentlich nicht gut, da wenn diese Funktion fehlschlägt die anderen
	 * immernoch funktionieren, aber halt nichts machen.
	 */
	/*
	 * if (AnzahlvonGehegen > 9) {
	 * System.err.println("Es können nicht mehr als 10 Gehege angelegt werden");
	 * return -1; } else if (gehege_count_array >= 9 ) { System.err.
	 * println("Es können keine Gehege mehr angelegt werden, da die maximale Anzahl erreicht wurde ("
	 * + gehege_count_array + "/" + "10)"); return -1; } else if
	 * ((gehege_count_array + AnzahlvonGehegen) > 9) { // ist überhaupt genug platz
	 * noch da? System.err.
	 * println("Das Anlegen dieser Anzahl an neuen Gehegen ist unzulässig. Es können allerdings noch "
	 * + (10 - gehege_count_array) + " Gehege angelegt werden."); return -1; }
	 * return 0; }
	 * 
	 * 
	 * public void setVogelgehege(String[] name, Zoo zoo, int vogel_gehege_count) {
	 * if(checkiffull(vogel_gehege_count)!=0) { return ; } else { //okay: es gilt:
	 * gc < 10 && vgc <= 10
	 * 
	 * for (int i = 0; i < vogel_gehege_count; i++) { if (gehege_count_array < 9) {
	 * gehege_count_array++; // letzter durchlauf = 10 this.vogelgehege[i] = new
	 * Vogelgehege(name[i], zoo); System.out.println( this.name +
	 * " hat jetzt ein neues Vogelgehege mit der Bezeichnung '" + name[i] + "'");
	 * 
	 * } else if (gehege_count_array == 9) {
	 * System.out.println("Maximale Gehegeanzahl wurde erreicht.");
	 * 
	 * } else { System.err.println(this.name +
	 * " hat die maximale Gehegeanzahl erreicht (" + (gehege_count_array + 1) +
	 * "/10)"); System.err.println("Es wurden keine neuen Gehege angelegt"); break;
	 * 
	 * } } } } public void setLandsaeugeTierGehege(String[] name, Zoo zoo, int
	 * landsaeuge_gehege_count) { if (checkiffull(landsaeuge_gehege_count) != 0) {
	 * return; } else { for (int i = 0; i < landsaeuge_gehege_count; i++) { if
	 * (gehege_count_array < 9) { gehege_count_array++; // letzter durchlauf = 10
	 * this.landsaeugetiergehege[i] = new LandsaeugeTierGehege(name[i], zoo);
	 * System.out.println(this.name +
	 * " hat jetzt ein neues Landsaeugetiergehege mit der Bezeichnung '" + name[i] +
	 * "'");
	 * 
	 * if (gehege_count_array == 9) { System.out.println(this.name +
	 * " hat die max Gehegeanzahl erreicht"); break; } } } }
	 * 
	 * } public void setAquarium(String[] name, Zoo zoo, int aqua_gehege_count) {
	 * 
	 * if (checkiffull(aqua_gehege_count) != 0) { return;
	 * 
	 * } else { for (int i = 0; i < aqua_gehege_count; i++) { if (gehege_count_array
	 * < 9) { this.getAquarium[i] = new Aquarium(name[i], zoo); System.out.println(
	 * this.name + " " + "hat jetzt ein neues Aquarium mit der Bezeichnung '" +
	 * name[i] + "'"); gehege_count_array++;
	 * 
	 * if (gehege_count_array == 9) { System.out.println(this.name + " " +
	 * "hat die max Gehegeanzahl erreicht"); break; } } } } }
	 */
	// in arbeit getTier moveTier addTier
	
	public Tier getTier(String Name) { //Gute Idee allerdings müsste es nach UML alle gehege durchklappern
		
		int temp = 0;	//temp speichert den Index wo sich das gewuenschte Gehege befindet
		for(int i = 0; i < this.tiere.length; i++) {
			if(this.tiere[i] != null) {
				if(this.tiere[i].getName() == Name) {
					temp = i;
				}
			}
		}
		return this.tiere[temp];
	}	
	
	public void moveTier(Tier tier, Gehege oldGehege, Gehege newGehege) {

		if(oldGehege == newGehege) {
			System.out.println(tier.getName()+" ist bereits in "+ newGehege.getName());
		}
		else {
			boolean isInsideOldGehege = false;
			for(int p = 0; p < oldGehege.getTiere().length; p++) {
				if(oldGehege.getTiere()[p] != null) {
					if(oldGehege.getTiere()[p].getName() == tier.getName()) {
						isInsideOldGehege = true;
					}
				}
			}
			if(isInsideOldGehege == true) {
				addTier(tier, newGehege.getName());
			}
			else {
				System.out.println(tier.getName()+" existiert nicht in "+ oldGehege.getName());
				return;
			}
		
		boolean isInsideNewGehege = false;
		for(int k = 0; k < newGehege.getTiere().length; k++) {
			if(newGehege.getTiere()[k] != null) {
				if(newGehege.getTiere()[k].getName() == tier.getName()) {
					isInsideNewGehege = true;
				}
			}
		}
		if(isInsideNewGehege == false) {
			System.out.println(tier.getTypName()+" "+tier.getName()+" bleibt erstmal in "+ oldGehege.getName());
		}
		else if(isInsideNewGehege == true) {
			if(oldGehege != null) {
				for(int i = 0; i < oldGehege.getTiere().length; i++) {
					if(oldGehege.getTiere()[i] != null) {
						if(tier.getName() == oldGehege.getTiere()[i].getName()) {
							oldGehege.getTiere()[i] = null;
						}
					}
				}
			}
		}
		}
		
	}	
	
	public void addTier(Tier tier, String Bezeichnung){
		for(int q = 0; q < this.tiere.length; q++) {
			
			if(q == this.tiere.length-1 && this.tiere[q] != null) { //schaut ob schon 10 tiere im gehege sind
				System.out.println(this.getName()+" kann keine weiteren Tiere anlegen ");
			} else if(this.tiere[q] == null ) {
				this.tiere[q] = tier;
				break;
			}
		}
		
		int temp = 0;
		for(int i = 0; i < this.gehege.length; i++) { //sucht Bezeichnung von Gehege
			if( this.gehege[i] != null) {
				if(this.gehege[i].getName() == Bezeichnung) {
					temp = i;
					break;
				}
			}
			if(i == this.gehege.length-1) {
				System.out.println(this.getName()+" besitzt kein Gehege mit der Bezeichnung "+ Bezeichnung);
				return;
			}
		}
		//this.gehege[temp] ist das Gehege mit der entsprechenden Bezeichnung im Parameter
		if(this.gehege[temp].getGehege_typ() == tier.getGehege_typ()) {
			//Wenn das Tier kein Raubtier ist und im Gehege mind. ein Raubtier existiert kann das Tier nicht 
			//zogeordnet werden
			if(tier.isRaubtier() == false) {
				for(int k = 0; k < this.gehege[temp].getTiere().length; k++) {
					if(this.gehege[temp].getTiere()[k] != null) {
						if(this.gehege[temp].getTiere()[k].isRaubtier() == true) {
							allowed = false;
						}
					}
				}
				if(allowed == true) {
					this.gehege[temp].addTier(tier);
					tier.setGehege(this.gehege[temp]);
				}
				else if(allowed == false) {
					System.out.println(tier.getTypName() +" "+tier.getName()+" kann nicht zugeordnet werden, weil in "+ this.gehege[temp].getName()+" bereits Raubtiere leben");
				}
				allowed = true;
			}
			else if(tier.isRaubtier() == true) {
				for(int k = 0; k < this.gehege[temp].getTiere().length; k++) {
					if(this.gehege[temp].getTiere()[k] != null) {
						if(this.gehege[temp].getTiere()[k].isRaubtier() == false) {
							allowed = false;
						}
					}
				}
				
				if(allowed == true) {
					this.gehege[temp].addTier(tier);
					tier.setGehege(this.gehege[temp]);
				}
				else if(allowed == false) {
					System.out.println(tier.getTypName() +" "+tier.getName()+" kann nicht zugeordnet werden, weil sonst alle Tiere in "+ this.gehege[temp].getName()+" gefressen werden");
				}
				allowed = true;
			}
		}
		else{
			System.out.println(tier.getTypName()+" "+tier.getName()+" kann nicht in " + this.gehege[temp].getName()+" zugeordnet: ungeeignetes Gehege");
		}
		
	}

	
	//Notiz: add/setBesucher darf laut uml nicht existieren da der Besucher nicht teil des zoos ist.
	/*
	public void setBesucher(Besucher[] besucher) {
	//es wird geschaut wo ein freier Platz ist bei this.besucher array 
	//und setzt dort den besucher[k] ein, welcher �bergeben wird
		
		for(int k=0; k<besucher.length; k++) {
			if(freeSpaceBesucherArray == false) {
				System.out.println(this.getName()+" kann keine weiteren Besucher aufnehmen "
									+"entferne einige Besucher um neue einzuf�gen");
				break;
			}
			if(besucher[k] != null && freeSpaceBesucherArray == true) {
				for(int i=0; i<this.besucher.length;i++) {

					if((i == this.besucher.length-1) && (this.besucher[i] != null)) {
						 freeSpaceBesucherArray = false;
						break;
					}
					if(this.besucher[i] == null) {
						this.besucher[i] = besucher[k];
						break;
					}
				}
			}
		}
	}
	*/
	/*
	public void addBesucher(Besucher besucher) {
		for(int i = 0; i < this.besucher.length; i++) {
			
			if(i== this.besucher.length-1 && this.besucher[i] != null) {
				System.out.println(this.getName()+" kann keine weiteren Besucher anlegen ");
			}
			
			if(this.besucher[i] == null) {
				this.besucher[i] = besucher;
				System.out.println("Besucher "+ this.besucher[i].getName()+ " ist in "+ this.name+" angekommen");
				break;
			}
		}
	}
	*/
	// gemergt
	public void addGehege(int Gehege_typ, String[] name, Zoo zoo) { //allgemeine Methode für das Erstellen eines Geheges
		for (int k=0;k<name.length;k++){
			if (Gehege_typ == 1) {
				Gehege vogelgehege = new Vogelgehege(name[k], zoo);
				for (int i = 0; i < this.gehege.length; i++) { // sucht nach der ersten freien stelle in gehege und
					// platziert dort ein vogelgehege
					if (i == this.gehege.length - 1 && this.gehege[i] != null) {
						System.out.println(this.getName() + " kann keine weiteren Gehege anlegen ");

					} else if (this.gehege[i] == null) {
						this.gehege[i] = vogelgehege;
						break;
					}
				}
				System.out.println(this.getName() + " hat ein neues Vogelgehege mit der Bezeichnung " + name[k]);

			} else if (Gehege_typ == 2) {
				Gehege landsaeugetiergehege = new LandsaeugeTierGehege(name[k], zoo);
				for (int i = 0; i < this.gehege.length; i++) {
					if (i == this.gehege.length - 1 && this.gehege[i] != null) {
						System.out.println(this.getName() + " kann keine weiteren Gehege anlegen ");

					} else if (this.gehege[i] == null) {
						this.gehege[i] = landsaeugetiergehege;
						break;
					}
				}
				System.out.println(this.getName() + " hat ein neues LandsaeugeTierGehege mit der Bezeichnung " + name[k]);

			} else if (Gehege_typ == 3) {
				Gehege aquarium = new Aquarium(name[k], zoo);
				for (int i = 0; i < this.gehege.length; i++) {
					if (i == this.gehege.length - 1 && this.gehege[i] != null) {
						System.out.println(this.getName() + " kann keine weiteren Gehege anlegen ");

					} else if (this.gehege[i] == null) {
						this.gehege[i] = aquarium;
						break;
					}
				}
				System.out.println(this.getName() + " hat ein neues Aquarium mit der Bezeichnung " + name[k]);
			}
		}
	}

	public void outputZustand() {
		// Platzhalter
		System.out.println();

		// Zustand des Vogelgeheges
		for (int p = 0; p < gehege.length; p++) {
			if (gehege[p] != null) {

				System.out.print(this.name + " hat das Gehege " + this.gehege[p].getName() + " ");

				// Jedes Tier im Vogelgehege wird durchgegangen ... allerdings wird zuerst
				// geschaut
				// ob da �berhaupt Tiere drinnen sind

				for (int k = 0; k < gehege[p].getTiere().length; k++) {
					if (gehege[p].getTiere()[k] != null) {
						System.out.print(gehege[p].getTiere()[k].getName() + ", ");
					}
				}
				System.out.println(" ");
			}
		}

		// angestellte Zustand und wo sich welches Personal wo befindet

		for (int arb = 0; arb < angestellte.length; arb++) {
			if (angestellte[arb] != null) {
				System.out.println(this.name + " hat den Angestellten " + angestellte[arb].getName()
						+ " ,welcher sich um folgende Gehegen k�mmert: ");

				for (int g = 0; g < angestellte[arb].getGehege().length; g++) {
					if (angestellte[arb].getGehege()[g] != null) {
						System.out.print(angestellte[arb].getGehege()[g].getName() + ", ");
					}
				}
				System.out.println(" ");
			}
		}

		System.out.println();
		// TODO:Besucher output
		/*for (int i = 0; i < besucher().length && besucher[i] != null; i++) {
			besucher[i].outputBesucherZustand();
		}*/
	}

	public void addAngestellte(Personal angestellter) {
		for (int i = 0; i < this.angestellte.length; i++) {
			if ((i == this.angestellte.length - 1) && (this.angestellte[i] != null)) {
				// Fall: Am Ende der Liste ist ein Eintrag (vorher hochgezählt) ~> Liste voll
				System.out.println(this.getName() + " kann keine weiteren Angestellte anlegen ");
				return;
			} else if (this.angestellte[i] == null) {
				this.angestellte[i] = angestellter;
				System.out.println(angestellter.getName() + " arbeitet jetzt bei " + this.getName());
				break;
			}
		}
	}

	public Gehege getGehege(String Bezeichnung) {
		int temp = 0;	//temp speichert den Index wo sich das gewuenschte Gehege befindet
		for(int i = 0; i < this.gehege.length; i++) {
			if(this.gehege[i] != null) {
				if(this.gehege[i].getName() == Bezeichnung) {
					temp = i;
				}
			}
		}
		return this.gehege[temp];
	}
	
	
	
}
