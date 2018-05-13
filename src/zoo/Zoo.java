package zoo;

import zoo.Gehege.Aquarium;
import zoo.Gehege.Gehege;
import zoo.Gehege.LandsaeugeTierGehege;
import zoo.Gehege.Vogelgehege;
import zoo.Personen.Besucher;
import zoo.Personen.Personal;
import zoo.Tier.Loewe;
import zoo.Tier.Tier;

public class Zoo {
	
	private String name;

	
	private Gehege[] gehege = new Gehege[10];
	
	private Tier[] tiere = new Tier[100];
	private Personal[] angestellte = new Personal[20];
	
	static boolean freeSpaceBesucherArray = true;
	private Besucher[] besucher = new Besucher[20];
	
	
	
	public Zoo(String name) {
		
		this.setName(name);
		}
		
	public Gehege[] getFullGehege() {
		return this.gehege;
	}
	public void addGehege(int Gehege_typ,String name) {
		Gehege neuesgehege;
		if(Gehege_typ == 1) {
			neuesgehege = new Vogelgehege(name,this);
		}
		else if(Gehege_typ == 2) {
			neuesgehege = new LandsaeugeTierGehege(name,this);
		}
		else if(Gehege_typ == 3) {
			neuesgehege = new Aquarium(name,this);	
		}else {
			neuesgehege =null;
		}
		for(int i=0; i<this.gehege.length; i++) {
			if(i== this.gehege.length-1 && this.gehege[i] != null) {
				System.out.println(this.getName()+" kann keine weiteren Gehege anlegen ");
				break;
			}
			if(this.gehege[i] == null) {
				this.gehege[i] = neuesgehege;
				System.out.println(this.getName()+" hat ein neues Gehege mit der Bezeichnung "+ name);
				break;
			}
		}
	}
	
	public void addGehegeArray(int Gehege_typ, String[] names) {
		//check ob die neuen Gehegen reinpassen in den Zoo
		int count = 0;
		for(int k = 0; k<this.gehege.length; k++) {
			if(this.gehege[k] != null) count++;
		}
		//wenn die Anzahl an Gehege zu groﬂ ist
		if(count+names.length > 10) {
			System.out.println(count +" Die Gehege Anzahl ist zu groﬂ "+ this.getName()+" hat noch "+ (10-count)+" Gehegeplaetze frei");
		}
		else {
				for(int i = 0; i<names.length && names[i] != null; i++) {
					this.addGehege(Gehege_typ, names[i]);
				}
		
		}
	}
	
	public void removeGehege(String Bezeichnung) {
		//wenn die Bezeichnung ¸bereinstimmt mit dem Namen des Geheges
		//dann ist dann wird das Gehege aus dem Gehege array entfernt
		
		boolean checkIfAnimalInside = false;
		for(int n = 0; n < this.gehege.length; n++) {
			if(this.gehege[n] != null) {
				if(Bezeichnung == this.gehege[n].getName()) {
					for(int ti = 0; ti < this.gehege[n].getTiere().length; ti++) {
						if(this.gehege[n].getTiere()[ti] != null) checkIfAnimalInside = true;
					}
				}
				break;
			}
		}
		
		if(checkIfAnimalInside == true) {
			System.out.println("In diesem Gehege leben Tiere...Gehege kann deshalb nicht entfernt werden");
		}
		
		if(checkIfAnimalInside == false) {
		for(int i = 0; i<this.gehege.length; i++) {
			if(this.gehege[i] != null) {
				if(this.gehege[i].getName() == Bezeichnung){
					System.out.println( this.gehege[i].getName()+" wurde erfolgreich von "+this.getName()+" entfernt");
					this.gehege[i] = null;
					break;
				}
			}
		}
		
		for(int k = 0; k < this.besucher.length; k++) {
			if(this.besucher[k] != null) {
				if(this.besucher[k].getGehege().getName() == Bezeichnung) {
					this.besucher[k].setGehege(null);
					break;
				}
			}
		}
		
		for(int k = 0; k < this.angestellte.length; k++) {
			if(this.angestellte[k] != null) {
				
				for(int p = 0; p < this.angestellte[k].getGehege().length; p++) {
					if(this.angestellte[k].getGehege()[p] != null) {
						if(this.angestellte[k].getGehege()[p].getName() == Bezeichnung) {
							this.angestellte[k].nullGehegeAtIndex(Bezeichnung);
							break;
						}
					}
				}
			}
		}
		}
	}
	
	
	public void moveTier(Tier tier, Gehege oldGehege, Gehege newGehege) {

		if(oldGehege == newGehege) {
			System.out.println(tier.getName()+" ist bereits in "+ newGehege.getName());
		}
		else {
			
			boolean isInsideOldGehege = false;
			isInsideOldGehege = oldGehege.isInsideGehege(tier);
		
			if(isInsideOldGehege == true) {
				addTier(tier, newGehege.getName());
			}
			else {
				System.out.println(tier.getName()+" existiert nicht in "+ oldGehege.getName());
				return;
			}
		
		boolean isInsideNewGehege = false;
		isInsideNewGehege = newGehege.isInsideGehege(tier);
		
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
	
	public Gehege[] getGehegeByTypeArr(int Gehege_typ) {
		
		int index_cnt = 0;
		int temp_array_size = 0;
		
		for(int i = 0; i < this.gehege.length; i++) {
			if(this.gehege[i] != null) {
				if(this.gehege[i].getGehege_typ() == Gehege_typ) {
					temp_array_size++;
				}
			}
		}
		System.out.println();
		temp_array_size = 10 * temp_array_size;
		Gehege [] temp = new Gehege[temp_array_size];
		
		for(int i = 0; i < this.gehege.length; i++) {
			if(this.gehege[i] != null) {
				if(this.gehege[i].getGehege_typ() == Gehege_typ) {
					temp[index_cnt] = this.gehege[i];
					index_cnt++;
				}
			}
		}
		return temp;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	//////Personal
	public Personal getAngestellte(String Name) {
		int temp = 0;	//temp speichert den Index wo sich das gewuenschte Gehege befindet
		for(int i = 0; i < this.angestellte.length; i++) {
			if(this.angestellte[i] != null) {
				if(this.angestellte[i].getName() == Name) {
					temp = i;
				}
			}
		}
		return this.angestellte[temp];
	}
	public void addAngestellte(Personal angestellter) {
	
		
		for(int i = 0; i < this.angestellte.length; i++){
			if(this.angestellte[i] == null) {
				this.angestellte[i] = angestellter;
				System.out.println(angestellter.getName()+" arbeitet jetzt bei "+ this.getName());
				break;
			}
			
		}
	}
	
	////////Tier zuordnen
	public Tier getTier(String Name) {
		
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
	
	
	
	public void addTier(Tier tier, String GehegeBezeichnung){
		for(int q = 0; q < this.tiere.length; q++) {
			if(this.tiere[q] == null ) {
				this.tiere[q] = tier;
				break;
			}
		}
		//speichert in tempvariable den Index ab der die GehegeBezeichnung hat
		int temp = 0;
		for(int i = 0; i < this.gehege.length; i++) {
			if( this.gehege[i] != null) {
				if(this.gehege[i].getName() == GehegeBezeichnung) {
					temp = i;
					break;
				}
			}
			//wenn kein Gehege gefunden wird 
			if(i == this.gehege.length-1) {
				System.out.println(this.getName()+" besitzt kein Gehege mit der Bezeichnung "+ GehegeBezeichnung);
				return;
			}
		}
		this.gehege[temp].addTier(tier);
	}
	
	
	public Besucher getBesucher(String Name) {
		
		int temp = 0;	//temp speichert den Index wo sich das gewuenschte Gehege befindet
		for(int i = 0; i < this.besucher.length; i++) {
			if(this.besucher[i] != null) {
				if(this.besucher[i].getName() == Name) {
					temp = i;
				}
			}
		}
		return this.besucher[temp];
	}
	
	public Besucher[] getBesucherArr() {
		return besucher;
	}

	public void setBesucher(Besucher[] besucher) {
	//es wird geschaut wo ein freier Platz ist bei this.besucher array 
	//und setzt dort den besucher[k] ein, welcher ¸bergeben wird
		
		for(int k=0; k<besucher.length; k++) {
			if(freeSpaceBesucherArray == false) {
				System.out.println(this.getName()+" kann keine weiteren Besucher aufnehmen "
									+"entferne einige Besucher um neue einzuf¸gen");
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
	
	public void addBesucher(Besucher besucher) {
		for(int i = 0; i < this.besucher.length; i++) {
			if(this.besucher[i] == null) {
				this.besucher[i] = besucher;
				System.out.println("Besucher "+ this.besucher[i].getName()+ " ist in "+ this.name+" angekommen");
				break;
			}
		}
	}
	
	public void removeBesucher(Besucher besucher) {
		for(int i = 0; i < this.besucher.length-1; i++) {
			if(this.besucher[i] != null) {
				if(this.besucher[i].getName().equals(besucher.getName())) {
					this.besucher[i]=null;
				}
			}
		}
	}
	public void outputZustand() {
		
		//Platzhalter
		System.out.println();
		
		
	//Zustand des Vogelgeheges
		for(int p = 0; p< gehege.length; p++) {
			if(gehege[p] != null) {
				
			System.out.print(this.name+" hat das Gehege "+ this.gehege[p].getName()+" ");
			
			//Jedes Tier im Vogelgehege wird durchgegangen ... allerdings wird zuerst geschaut
			//ob da ¸berhaupt Tiere drinnen sind
			
				for(int k = 0; k<gehege[p].getTiere().length; k++) {
					if(gehege[p].getTiere()[k] != null) {
					System.out.print( gehege[p].getTiere()[k].getName()+", ");
					}
				}
				System.out.println(" ");
			}	
		}
		
	//	angestellte Zustand und wo sich welches Personal wo befindet
		
		for(int arb = 0; arb < angestellte.length; arb++) {
			if(angestellte[arb] != null) {	
				System.out.println(this.name+" hat den Angestellten "+ angestellte[arb].getName()+" ,welcher sich um folgende Gehegen k¸mmert: ");
				
				for(int g = 0; g< angestellte[arb].getGehege().length; g++) {
					if(angestellte[arb].getGehege()[g] != null) {
						System.out.print(angestellte[arb].getGehege()[g].getName()+", ");
					}
				}
				System.out.println(" ");
			}
		}
		
		System.out.println();
		//Besucher output
		for(int i=0; i< getBesucherArr().length && getBesucherArr()[i]!=null ; i++) {
			getBesucherArr()[i].outputBesucherZustand();
		}
	}
	
}
