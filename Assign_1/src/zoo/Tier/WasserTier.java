package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public abstract class WasserTier extends Tier{

	public WasserTier(String name, Zoo zoo) {
		super(name, zoo);
		this.Gehege_typ = 3;
	}

}
