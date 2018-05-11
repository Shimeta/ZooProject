package zoo.Personen;

import zoo.Gehege.Gehege;

public class Besucher extends Personen {
	
	private Gehege gehege;

	public Besucher(String name, Gehege gehege) {
		super(name,null);
		this.gehege = gehege;
		this.gehege.getOwner().addBesucher(this);
		
		if(gehege != null) {
			System.out.println(this.getName()+" besucht "+ gehege.getName());
		}
		
	}

	public Gehege ggetGehege() {
		return gehege;
	}

	public void besucht(Gehege g) {
		this.gehege = g;	
		System.out.println(getName()+" "+"besucht "+ g.getName());
	}
	
	public void outputBesucherZustand() {
		System.out.println(getName()+" befindet sich bei folgendem Gehege: "+ this.gehege.getName()+" sieht ");
		for(int i = 0; i < this.gehege.getTiere().length; i++) {
			if(this.gehege.getTiere()[i] != null) {
				System.out.print(this.gehege.getTiere()[i].getTypName()+" "+this.gehege.getTiere()[i].getName()+", "); 	
			}
		}
		System.out.println();
	}
	
	
}
