package tuc.Zoo.Personen;

import tuc.Zoo.Zoo;
import tuc.Zoo.Gehege.*;
import tuc.Zoo.Tier.*;

public interface ITier {
	public void füttere(Tier tier, Personal personal); //implemented. Gibt aus, dass tier von personal gefüttert wird.
	public void lebtIn(String gehege, Gehege neuesGehege, Gehege altesGehege, Zoo zuu); //implemented
}
