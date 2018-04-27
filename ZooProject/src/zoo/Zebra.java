package zoo;

public class Zebra extends LandsaeugeTier{

	public Zebra(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
	
		System.out.println("Das Zebra "+ name+ " wurde erstellt");
	}

}
