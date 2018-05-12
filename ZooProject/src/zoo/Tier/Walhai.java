package zoo.Tier;
import zoo.Zoo;

public class Walhai extends WasserTier{

	public Walhai(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Walhai";
		System.out.println("Der Walhai " + name +" wurde erstellt");
	}
}
