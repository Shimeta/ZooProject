package tuc.Zoo;

import tuc.Zoo.Gehege.*;
import tuc.Zoo.Personen.*;
import tuc.Zoo.Tier.*;
public class Main {
	
	public static void main(String[] args) {
	//deklariere Gehege kp vllt ist das besser lesbar

	//Aufg 2 Schritt 1
	Zoo zuu = new Zoo("Nürnberger Zoo",10,10,20);
	zuu.print_Details();
	Vogelgehege Papageiengehege = new Vogelgehege("Papageiengehege",zuu);
	Vogelgehege Adlergehege     = new Vogelgehege("Adlergehege",zuu);
	Vogelgehege Pinguingehege   = new Vogelgehege("Pinguingehege",zuu);
	
	/*
	Vogelgehege[] Vogelreservoire;
	Vogelreservoire[0]= Papageiengehege;
	Vogelreservoire[2]= Adlergehege;
	Vogelreservoire[3]= Pinguingehege;
	*/
	
	Landsäugetiergehege Steppe = new Landsäugetiergehege("Steppe",zuu);
	Landsäugetiergehege	Wald   = new Landsäugetiergehege("Wald",zuu);
	Landsäugetiergehege Wüste  = new Landsäugetiergehege("Wüste",zuu);
	
	Aquarium Walhaibecken   = new Aquarium("Walhaibecken",zuu);
	Aquarium Kugelfischtank = new Aquarium("Kugelfischtank",zuu);
	
	//Aufg 2 Schritt 2
	Papagei Tick  = new Papagei("Tick");
	Papagei Trick = new Papagei("Trick");
	Papagei Track = new Papagei("Track");
	System.out.println("\nPapageiengehege:");
	Papageiengehege.printDetails();
	
	
	//Schritt 3
	Löwe Tywin  = new Löwe("Tywin");
	Löwe Jaime  = new Löwe("Jaime");
	Löwe Cersei = new Löwe("Cersei");
	Löwe Joffrey= new Löwe("Joffrey");
	//-> mv all into Wüste


	//Schritt 4
	
	Zebra Zalana = new Zebra("Zalana");
	Zebra Bran   = new Zebra("Bran");
	Zebra Arya   = new Zebra("Arya");
	// -> mv all into Steppe

	Zebra Eddard = new Zebra("Eddard");
	Zebra Robb   = new Zebra("Robb");
	// -> mv all into Wald
	
	//Schritt 5 längste Flüsse von Deutschland 
	Kugelfisch Rhein = new Kugelfisch("Rhein");
	Kugelfisch Weser = new Kugelfisch("Weser");
	Kugelfisch Elbe = new Kugelfisch("Elbe");
	Kugelfisch Donau = new Kugelfisch("Donau");
	Kugelfisch Main = new Kugelfisch("Main");
	Kugelfisch Saale = new Kugelfisch("Saale");
	Kugelfisch Spree = new Kugelfisch("Spree");
	Kugelfisch Ems = new Kugelfisch("Ems");
	Kugelfisch Neckar = new Kugelfisch("Neckar");
	Kugelfisch Havel = new Kugelfisch("Havel");
	
	//-> mv all into Kugelfischtank

	//Schritt 6
	Walhai Moby= new Walhai("Moby");
	Walhai Dick= new Walhai("Dick");
	//moveto(Walhaibecken);
	
	//Schritt 7
	Adler American= new Adler("American");
	Adler Dream= new Adler("Dream");
	//mv Adlergehege
	
	//Schritt 8
	Personal Ramsay= new Personal("Ramsay");
	Personal Sam= new Personal("Sam");
	Personal Daenerys= new Personal("Daenerys");
	
	/*betreuung 
	* Ramsay Landsäugetiere;
	* Sam -> Wassertiere
	* Daenerys -> Vögel */
	
	//Schritt 9
	Besucher Catelyn = new Besucher("Catelyn");
	Besucher Aerys = new Besucher("Bronn");
	Besucher Sansa = new Besucher("Sansa");
	Besucher Willy = new Besucher("Willy");
	Wüste.erhöhe_Bewohneranzahl();
	Wüste.showBewohner();
	Catelyn.besucht(Wüste);
	/*
	 * Schritte 10-13
	 */
	}
	
}
