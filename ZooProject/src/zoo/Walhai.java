package zoo;

public class Walhai extends WasserTier{

	public Walhai(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Walhai " + name +" wurde erstellt");
		
	}

}
