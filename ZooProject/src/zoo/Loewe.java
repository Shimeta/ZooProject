package zoo;

public class Loewe extends LandsaeugeTier{

	public Loewe(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Loewe "+name+" wurde erstellt");
	}

}
