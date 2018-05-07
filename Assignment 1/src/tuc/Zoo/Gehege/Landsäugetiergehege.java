package tuc.Zoo.Gehege;

import tuc.Zoo.Zoo;

public class Landsäugetiergehege extends Gehege{

	public Landsäugetiergehege(String Name,Zoo zuu) {
		super(Name,zuu);
		this.Typ="Land";
	}
/*
	public void printDetails() {
		System.out.println("Bezeichnung: " + Bezeichnung);
		System.out.println("Typ: " + this.Typ);
	}
*/
}
