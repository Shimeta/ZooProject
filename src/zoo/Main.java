package zoo;

import zoo.Personen.Besucher;
import zoo.Personen.Personal;
import zoo.Tier.Adler;
import zoo.Tier.KugelFisch;
import zoo.Tier.Loewe;
import zoo.Tier.Papagei;
import zoo.Tier.Tier;
import zoo.Tier.Walhai;
import zoo.Tier.WasserTier;
import zoo.Tier.Zebra;

public class Main {

	public static void main(String[] args) {
		
		//Aufg 1
		System.out.println("\nAufg 1\n");
		Zoo sayan_zoo = new Zoo("SayanZoo");
		
		
		//Aufg 2 Schritt 1
		System.out.println("\nAufg 2 Schritt 1\n");
		//3 Vogelgehege werden hier erzeugt
		String[] vogel_gehege_names = new String[3];
		vogel_gehege_names[0] = "Papageiengehege";
		vogel_gehege_names[1] = "Adlergehege";
		vogel_gehege_names[2] = "Pinguingehege";

		/*sayan_zoo.addGehege(1, vogel_gehege_names[0]);
		sayan_zoo.addGehege(1, vogel_gehege_names[1]);
		sayan_zoo.addGehege(1, vogel_gehege_names[2]);*/
		
		sayan_zoo.addGehegeArray(1, vogel_gehege_names);
		//3 Landsaeugetiergehege werden hier erzeugt
		String[] landsaeugetier_gehege_names = new String[3];
		landsaeugetier_gehege_names[0] = "Steppe";
		landsaeugetier_gehege_names[1] = "Wald";
		landsaeugetier_gehege_names[2] = "Wueste";
		
		sayan_zoo.addGehege(2, landsaeugetier_gehege_names[0]);
		sayan_zoo.addGehege(2, landsaeugetier_gehege_names[1]);
		sayan_zoo.addGehege(2, landsaeugetier_gehege_names[2]);
		
		//2 Aquarien werden hier erzeugt
		//System.out.println("2 Aquarien werden hier erzeugt");
		String[] aqua_gehege_names = new String[2];
		aqua_gehege_names[0] = "Walhaibecken";
		aqua_gehege_names[1] = "Kugelfischtank";

		sayan_zoo.addGehege(3, aqua_gehege_names[0] );
		sayan_zoo.addGehege(3, aqua_gehege_names[1]);

		
		
		
		//Aufg 2 Schritt 2
		System.out.println("\nAufg 2 Schritt 2\n");
		//Papageien werden erzeugt und "Papageiengehege" zugeordnet
		//die 3 ist nur das alter der Papageien eigentlich unwichtig :)
		Tier[] papas = new Tier[3];
		Papagei Tick = new Papagei("Tick",sayan_zoo);
		Papagei Trick = new Papagei("Trick",sayan_zoo);
		Papagei Track = new Papagei("Track",sayan_zoo);
		
		papas[0] = Tick;
		papas[1] = Trick;
		papas[2] = Track;
		
		//die Tiere weden dem Gehege zugeordnet;
		sayan_zoo.addTier(papas[1], vogel_gehege_names[0]);
		sayan_zoo.addTier(papas[2], vogel_gehege_names[0]);
		sayan_zoo.addTier(papas[0], vogel_gehege_names[0]);
		
		
		//Schritt 3
		System.out.println("\nSchritt 3\n");
		//4 loewn alle in die Wueste
		Tier[] loewen = new Tier[4];
		Loewe Tywin = new Loewe("Tywin",sayan_zoo);
		Loewe Jaime = new Loewe("Jaime",sayan_zoo);
		Loewe Cersei = new Loewe("Cersei",sayan_zoo);
		Loewe Joffrey = new Loewe("Joffrey",sayan_zoo);
		
		loewen[0]=Tywin;
		loewen[1]=Jaime;
		loewen[2]=Cersei;
		loewen[3]=Joffrey;
		
		for(int p=0; p<loewen.length; p++) {
			sayan_zoo.addTier(loewen[p], "Wueste");
		}
		
		//Schritt 4
		System.out.println("\nSchritt 4:\n");
		//5 Zebras Eddard Robb Wald Rest Steppe
		
		Tier[] zebras = new Tier[5];
		Zebra Zalana = new Zebra("Zalana",sayan_zoo);
		Zebra Eddard = new Zebra("Eddard",sayan_zoo);
		Zebra Bran = new Zebra("Bran",sayan_zoo);
		Zebra Robb = new Zebra("Robb",sayan_zoo);
		Zebra Arya = new Zebra("Arya",sayan_zoo);
		
		
		zebras[0] = Zalana;
		zebras[1] = Eddard;
		zebras[2] = Bran;
		zebras[3] = Robb;
		zebras[4] = Arya;
		//Nicht verwendet 
		
		//addtier in LansaugeTierGehege unterscheidet jz zw Lansäugetieren und keinen (Loewe und Zebra ist white-listet)

		sayan_zoo.addTier(Zalana,landsaeugetier_gehege_names[0]);
		sayan_zoo.addTier(Bran,landsaeugetier_gehege_names[1]);
		sayan_zoo.addTier(Arya,landsaeugetier_gehege_names[0]);
		sayan_zoo.addTier(Eddard,landsaeugetier_gehege_names[1]);
		sayan_zoo.addTier(Robb,landsaeugetier_gehege_names[0]);
		
		//Schritt 5
		System.out.print("\nSchritt 5:\n");
		//Kugelfische 10 -> Kugelfischtank
		Tier[] kugel_fische = new Tier[10];
		
		String[] kugel_fische_names = new String[10];
		
		KugelFisch Rhein = new KugelFisch("Rhein", sayan_zoo);
		KugelFisch Weser = new KugelFisch("Weser", sayan_zoo);
		KugelFisch Elbe = new KugelFisch("Elbe", sayan_zoo);
		KugelFisch Donau = new KugelFisch("Donau", sayan_zoo);
		KugelFisch Main = new KugelFisch("Main", sayan_zoo);
		KugelFisch Saale = new KugelFisch("Saale", sayan_zoo);
		KugelFisch Spree = new KugelFisch("Spree", sayan_zoo);
		KugelFisch Ems = new KugelFisch("Ems", sayan_zoo);
		KugelFisch Neckar = new KugelFisch("Neckar", sayan_zoo);
		KugelFisch Havel = new KugelFisch("Havel", sayan_zoo);
		
		kugel_fische_names[0] = "Rhein";
		kugel_fische_names[1] = "Weser";
		kugel_fische_names[2] = "Elbe";
		kugel_fische_names[3] = "Donau";
		kugel_fische_names[4] = "Main";
		kugel_fische_names[5] = "Saale";
		kugel_fische_names[6] = "Spree";
		kugel_fische_names[7] = "Ems";
		kugel_fische_names[8] = "Neckar";
		kugel_fische_names[9] = "Havel";
		
		kugel_fische[0] = Rhein;
		kugel_fische[1] = Weser;
		kugel_fische[2] = Elbe;
		kugel_fische[3] = Donau;
		kugel_fische[4] = Main;
		kugel_fische[5] = Saale;
		kugel_fische[6] = Spree;
		kugel_fische[7] = Ems;
		kugel_fische[8] = Neckar;
		kugel_fische[9] = Havel;
		
		for(int i = 0; i < kugel_fische.length; i++){
			sayan_zoo.addTier(kugel_fische[i], aqua_gehege_names[1]);
		}
		
		
		//Schritt 6
		System.out.println("\nSchritt 6\n");
		//2 Walhaie
		Tier[] walhaie = new Tier[2];


		Walhai Moby = new Walhai("Moby",sayan_zoo);
		Walhai Dick = new Walhai("Dick",sayan_zoo);
		
		walhaie[0] = Moby;
		walhaie[1] = Dick;

		sayan_zoo.addTier(walhaie[0], aqua_gehege_names[0]);
		sayan_zoo.addTier(walhaie[1], aqua_gehege_names[0]);
		

		//Schritt 7
		System.out.print("\nSchritt 7:\n");
		Tier[] adler = new Tier[2];
		
		Adler American = new Adler("American",sayan_zoo);
		Adler Dream = new Adler("Dream",sayan_zoo);
		
		adler[0] = American;
		adler[1] = Dream;
		
		sayan_zoo.addTier(adler[0],"Adlergehege");
		sayan_zoo.addTier(adler[1],"Adlergehege");
		
		//Schritt 8
		System.out.println("\nSchritt 8\n");				//TODO: siehe Personen.java
		//Personal muss noch gemacht werden Ramsay betreut LandsäugeTiere
		//Sam ->Wassertiere, Deanerys -> Vögel
		Personal[] a = new Personal[3];
		Personal Ramsay = new Personal("Ramsay",sayan_zoo, sayan_zoo.getGehegeByTypeArr(2));
		Personal Sam = new Personal("Sam",sayan_zoo, sayan_zoo.getGehegeByTypeArr(3));
		Personal Daenerys = new Personal("Daenerys",sayan_zoo, sayan_zoo.getGehegeByTypeArr(1));
		a[0] = Ramsay;
		a[1] = Sam;
		a[2] = Daenerys;
		
		
		//Schritt 9
		System.out.println("\nSchritt 9\n");
		//Besucher
		
		Besucher Caitlyn = new Besucher("Caitlyn", sayan_zoo.getGehege("Wueste"));
		Besucher Aerys = new Besucher("Aerys",sayan_zoo.getGehege("Adlergehege"));
		Besucher Bronn = new Besucher("Bronn", sayan_zoo.getGehege("Kugelfischtank"));
		Besucher Sansa = new Besucher("Sansa", sayan_zoo.getGehege("Walhaibecken"));
		Besucher Willy = new Besucher("Willy", sayan_zoo.getGehege("Wald"));
		
		Besucher[] besucher_arr = new Besucher[5];
		besucher_arr[0] = Caitlyn;
		besucher_arr[1] = Aerys;
		besucher_arr[2] = Bronn;
		besucher_arr[3] = Sansa;
		besucher_arr[4] = Willy;
		
		Willy.besucht(sayan_zoo.getGehege(aqua_gehege_names[1]));
		
		Zoo neua_zoo = new Zoo("neua_zoo");
		neua_zoo.addGehege(2, "MenschenGehege");
		Willy.besucht(neua_zoo.getGehege("MenschenGehege"));
		System.out.println(Willy.getGehege().getOwner().getBesucher("Willy").getName());
		
		vogel_gehege_names[0] = "Papageiengehege";
		vogel_gehege_names[1] = "Adlergehege";
		vogel_gehege_names[2] = "Pinguingehege";
		landsaeugetier_gehege_names[0] = "Steppe";
		landsaeugetier_gehege_names[1] = "Wald";
		landsaeugetier_gehege_names[2] = "Wueste";
		aqua_gehege_names[0] = "Walhaibecken";
		aqua_gehege_names[1] = "Kugelfischtank";
		
		Caitlyn.besucht(sayan_zoo.getGehege(landsaeugetier_gehege_names[2]));
		Aerys.besucht(sayan_zoo.getGehege(vogel_gehege_names[1]));
		Bronn.besucht(sayan_zoo.getGehege(aqua_gehege_names[1]));
		Sansa.besucht(sayan_zoo.getGehege(aqua_gehege_names[0]));
		Willy.besucht(sayan_zoo.getGehege(landsaeugetier_gehege_names[1]));
		Willy.besucht(sayan_zoo.getGehege(aqua_gehege_names[0]));

		
		//	Schritt 10
		System.out.print("\nSchritt 10:\n");
		sayan_zoo.moveTier(Joffrey, sayan_zoo.getGehege("Wueste"), sayan_zoo.getGehege("Walhaibecken"));

		//Schritt 11
		System.out.print("\nSchritt 11:\n");
		sayan_zoo.moveTier(Tywin, sayan_zoo.getGehege("Wueste"), sayan_zoo.getGehege("Wueste"));
		
		//Schritt 12
		System.out.println("\nSchritt 12\n");
		Sansa.besucht(sayan_zoo.getGehege("Steppe"));
				
		
		//Schritt 13
		System.out.println("\nSchritt 13\n");
		sayan_zoo.moveTier(Cersei, sayan_zoo.getGehege("Wueste"), sayan_zoo.getGehege("Adlergehege"));	
		
		
		sayan_zoo.outputZustand();
		
	}
}
	
