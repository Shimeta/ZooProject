package zoo.Tier;
import zoo.Zoo;

public abstract class Vogel extends Tier{
	public Vogel(String name, Zoo zoo){
		super(name, zoo);
		this.Gehege_typ = 1;
	}
}
