package zoo.Personen;

import zoo.Gehege.Gehege;

public class Besucher extends Personen {

	public Besucher(String name, int alter) {
		super(name, alter);
	
		System.out.println("Besucher "+ name +" ist jetzt da");
		
		
	}

	public void besucht(Gehege g) {
				
		System.out.println(getName()+" "+"besucht "+ g.getName());
	
	
	}
	
	
	
	
	
}
