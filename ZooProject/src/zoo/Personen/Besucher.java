package zoo.Personen;

import zoo.Gehege.Gehege;

public class Besucher extends Personen {
	
	Gehege gehege;
	
	public Besucher(String name) {
		super(name, null); //TODO in Personen die Liste wegmachen
		System.out.println("Besucher "+ name +" ist im Zoo angekommen(wurde erstellt / ist da)");
	}

	public Gehege getGehege() {
			return gehege;
	}
	
	public void setGehege(Gehege gehege) { //hier war ein typo
		if(gehege == null) {
	    System.out.print("besuchtes Gehege "+"von "+this.getName()+" existiert nicht mehr "+ this.getName()+" besucht jetzt folgendes Gehege: ");
			for(int i = 0; i < this.gehege.getOwner().getFullGehege().length; i++) {
				if(this.gehege.getOwner().getFullGehege()[i] != null) {
					this.gehege = this.gehege.getOwner().getFullGehege()[i];
					System.out.println(this.gehege.getName());
					break;
				}
			}
		}
		else {
			this.gehege = gehege;
		}
	}

	public void besucht(Gehege g) {
		this.gehege = g;
		System.out.println(getName()+" besucht "+ g.getName());
	}
	
	public void outputBesucherZustand() {
		System.out.println(getName()+" befindet sich bei folgendem Gehege: "+ gehege.getName());
		for(int i = 0; i < this.gehege.getTiere().length; i++) {
			if(this.gehege.getTiere()[i] != null) {
				System.out.print(this.gehege.getTiere()[i].getTypName()+" "+this.gehege.getTiere()[i].getName()+", "); 	
			}
		}
		System.out.println();
	}
	
	
	
}
