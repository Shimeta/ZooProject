package zoo.Personen;

import zoo.Zoo;
import zoo.Gehege.Gehege;
import zoo.Tier.Tier;		//frag mich ob personal das benutzen müsst also wegen ITier & lebtin

public class Personal extends Personen {

//	private Zoo arbeitsplatz;

	public Personal(String name, int alter, Zoo arbeitsplatz) {
		super(name, alter);
//		this.arbeitsplatz = arbeitsplatz;

		System.out.println(name + " arbeitet jetzt bei " + arbeitsplatz.getName());

	}

	// Personal kümmert sich jeweils um die Tiere die in den jeweilgen übergebene
	// Gehegen leben
	// Bin mir nicht sicher ob das von der Aufgabenstellung so vorgesehen war...
	// weil in einem Aquarium zum Beispiel nur Wassertiere leben dürfen -> heißt
	// dann dass der Angstellte sich nur um Wassertiere kümmert

	public void betreut(Gehege[] gehege) {

		// schaut bei dem übergebenen gehegearray wann nichts mehr drinne steht(null)
		// weil zu Beginn ja mit der Länge 10 initialisiert war( siehe -> Gehege
		// Konstruktor)
		//@see 
		int gehege_length = 0;
		for (int p = 0; p < gehege.length; p++) {
			if (gehege[p] != null) {
				gehege_length++;
			}
		}

		// Z.B es gibt 3 verschiedene Vogelgehege und jedes Vogelgehege hat jeweils
		// andere Tiere
		// d.h jedes Vogelgehege wird durchgegangen und geschaut welches Tier da drin
		// lebt
		for (int k = 0; k < gehege_length; k++) {

			for (int i = 0; i < gehege[k].getTiere().length; i++) {

				if (gehege[k] != null && gehege[k].getTiere()[i] != null) {
					System.out.println(getName() + " betreut " + gehege[k].getTiere()[i].getName());
//					System.out.println(getName() + " betreut " + gehege[k].getTiere()[i].
				}

			}

		}

	}

}
