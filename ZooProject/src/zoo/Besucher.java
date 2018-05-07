package zoo;

public class Besucher extends Personen {
	
	Gehege gehege;

	public Besucher(String name, int alter, Gehege gehege) {
		super(name, alter, null);
		this.gehege = gehege;
	
		System.out.println("Besucher "+ name +" ist jetzt da");
		
		
	}

	public Gehege ggetGehege() {
		return gehege;
	}

	public void besucht(Gehege g) {
		this.gehege = g;
				
		System.out.println(getName()+" "+"besucht "+ g.getName());
	
	
	}
	
	public void outputBesucherZustand() {
		System.out.println(getName()+" befindet sich bei folgendem Gehege: "+ gehege.getName());
	}
	
	
	
	
	
}
