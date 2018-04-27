package zoo;

public class Papagei extends Vogel{

	public Papagei(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Papagei"+ " "+name+" "+"wurde erstellt");
	}

	
}
