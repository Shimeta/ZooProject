package zoo.Tier;

import zoo.Zoo;
//import zoo.Gehege.Gehege;

public abstract class LandsaeugeTier extends Tier {

	public LandsaeugeTier(String name, Zoo zoo) {
		super(name, zoo);
		this.Gehege_typ = 2;
		}
}
