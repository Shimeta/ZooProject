package zoo.Personen;

import zoo.Gehege.Gehege;

public class Besucher extends Personen {
	
	Gehege gehege;
	
	public Besucher(String name) {
		super(name, null); //TODO in Personen die Liste wegmachen
		System.out.println("Besucher "+ name +" ist im Zoo angekommen(wurde erstellt / ist da)");
	}

	public Gehege ggetGehege() {
		return gehege;
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
