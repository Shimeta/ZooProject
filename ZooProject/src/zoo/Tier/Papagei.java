package zoo.Tier;
import zoo.Zoo;


public class Papagei extends Vogel{
	public Papagei(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Papagei";
		System.out.println("Der Papagei"+ " "+name+" "+"wurde erstellt");
	}
}
