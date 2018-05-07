package tuc.Zoo.Gehege;

import tuc.Zoo.Zoo;
import tuc.Zoo.Gehege.*;

public class Aquarium extends Gehege{

	public Aquarium(String Name,Zoo zuu) {
		super(Name,zuu);
		this.Typ="Wasser";
	}
/*
	public void printDetails() {
		System.out.println("Bezeichnung: " + Bezeichnung);
		System.out.println("Typ: " + this.Typ);
	}
*/
}
