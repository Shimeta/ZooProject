package zoo.Tier;

import zoo.Zoo;
import zoo.Gehege.Gehege;

public class KugelFisch extends WasserTier{

	public KugelFisch(String name, int alter, Zoo zoo, Gehege gehege) {
		super(name, alter, zoo, gehege);
		
		System.out.println("Der Kugelfisch "+name+ " wurde erstellt");
		
	}

}
