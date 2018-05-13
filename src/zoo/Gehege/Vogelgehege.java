package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class Vogelgehege extends Gehege {

	public Vogelgehege(String name, Zoo owner) {
		super(name, owner);
		this.Gehege_typ = 1;
	}

	public void setTiere(Tier[] tiere) {
		// Array von Tieren werden hier übergegeben
		// Hier muss noch eingeschränkt werden ... also dass z.B nur Vögel dem
		// Vogelgehege zugeordnet werden dürfen

		super.setTiere(tiere);

		this.tier_array_index = tiere.length;

		for (int i = 0; i < tiere.length; i++) {

			System.out.println(tiere[i].getName() + " wurde dem " + this.getName() + " zugeordnet");
		}
	}

	

}
