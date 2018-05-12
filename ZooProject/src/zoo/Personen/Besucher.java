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
	
	public void ssetGeheeg(Gehege gehege) {
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
		System.out.println(getName()+" "+"besucht "+ g.getName());
	}
	
	public void outputBesucherZustand() {
		System.out.println(getName()+" befindet sich bei folgendem Gehege: "+ this.gehege.getName());
	}
	
	
	
}
