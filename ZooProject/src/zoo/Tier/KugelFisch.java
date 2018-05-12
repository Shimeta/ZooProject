package zoo.Tier;
import zoo.Zoo;

public class KugelFisch extends WasserTier{
	public KugelFisch(String name, Zoo zoo) {
		super(name, zoo);
		this.TypName="Kugelfisch";
		System.out.println("Der Kugelfisch "+name+ " wurde erstellt");
	}
}
