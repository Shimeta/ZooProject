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
		Zoo sayan_zoo = new Zoo("SayanZoo",null,null);
		
		
		//Aufg 2 Schritt 1
		//3 Vogelgehege werden hier erzeugt
		String[] vogel_gehege_names = new String[3];
		vogel_gehege_names[0] = "Papageiengehege";
		vogel_gehege_names[1] = "Adlergehege";
		vogel_gehege_names[2] = "Pinguingehege";
		
		sayan_zoo.setVogelgehege(vogel_gehege_names, sayan_zoo, 3);
		
		//3 Landsaeugetiergehege werden hier erzeugt
		String[] landsaeugetier_gehege_names = new String[3];
		landsaeugetier_gehege_names[0] = "Steppe";
		landsaeugetier_gehege_names[1] = "Wald";
		landsaeugetier_gehege_names[2] = "Wueste";
		
		sayan_zoo.setLandsaeugeTierGehege(landsaeugetier_gehege_names, sayan_zoo, 3);
		
		//2 Aquarien werden hier erzeugt
		String[] aqua_gehege_names = new String[2];
		aqua_gehege_names[0] = "Walhaibecken";
		aqua_gehege_names[1] = "Kugelfischtank";
		
		sayan_zoo.setAquarium(aqua_gehege_names, sayan_zoo, 2);
		
		
		
		//Aufg 2 Schritt 2
		//Papageien werden erzeugt und "Papageiengehege" zugeordnet
		//die 3 ist nur das alter der Papageien eigentlich unwichtig :)
		Tier[] papas = new Tier[3];
		Papagei Tick = new Papagei("Tick",3,sayan_zoo,sayan_zoo.vogelgehege[0]);
		Papagei Trick = new Papagei("Trick",3,sayan_zoo,sayan_zoo.vogelgehege[0]);
		Papagei Track = new Papagei("Track",3,sayan_zoo,sayan_zoo.vogelgehege[0]);
		
		papas[0] = Tick;
		papas[1] = Trick;
		papas[2] = Track;
		
		//die Tiere weden dem Gehege zugeordnet;
		sayan_zoo.vogelgehege[0].setTiere(papas);
		
		
		
		//Schritt 3
		//4 loewn alle in die Wueste
		Tier[] loewen = new Tier[4];
		Loewe Tywin = new Loewe("Tywin",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[2]);
		Loewe Jaime = new Loewe("Jaime",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[2]);
		Loewe Cersei = new Loewe("Cersei",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[2]);
		Loewe Joffrey = new Loewe("Joffrey",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[2]);
		
		loewen[0]=Tywin;
		loewen[1]=Jaime;
		loewen[2]=Cersei;
		loewen[3]=Joffrey;
		
		sayan_zoo.landsaeugetiergehege[2].setTiere(loewen);
		
		
		//Schritt 4
		//5 Zebras Eddard Robb Wald Rest Steppe
		
		Tier[] zebras = new Tier[5];
		Zebra Zalana = new Zebra("Zalana",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[0]);
		Zebra Eddard = new Zebra("Eddard",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[1]);
		Zebra Bran = new Zebra("Bran",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[0]);
		Zebra Robb = new Zebra("Robb",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[1]);
		Zebra Arya = new Zebra("Arya",7,sayan_zoo,sayan_zoo.landsaeugetiergehege[0]);
		
		zebras[0] = Zalana;
		zebras[1] = Eddard;
		zebras[2] = Bran;
		zebras[3] = Robb;
		zebras[4] = Arya;
		
		sayan_zoo.landsaeugetiergehege[0].addTier(Zalana);
		sayan_zoo.landsaeugetiergehege[0].addTier(Bran);
		sayan_zoo.landsaeugetiergehege[0].addTier(Arya);
		
		sayan_zoo.landsaeugetiergehege[1].addTier(Eddard);
		sayan_zoo.landsaeugetiergehege[1].addTier(Robb);
		

		//Schritt 5
		//Kugelfische 10 -> Kugelfischtank
		Tier[] kugel_fische = new Tier[10];
		KugelFisch A = new KugelFisch("A",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch B = new KugelFisch("B",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch C = new KugelFisch("C",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch D = new KugelFisch("D",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch E = new KugelFisch("E",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch F = new KugelFisch("F",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch G = new KugelFisch("G",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch H = new KugelFisch("H",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch I = new KugelFisch("I",7,sayan_zoo,sayan_zoo.aquarium[1]);
		KugelFisch J = new KugelFisch("J",7,sayan_zoo,sayan_zoo.aquarium[1]);
		
		kugel_fische[0] = A;
		kugel_fische[1] = B;
		kugel_fische[2] = C;
		kugel_fische[3] = D;
		kugel_fische[4] = E;
		kugel_fische[5] = F;
		kugel_fische[6] = G;
		kugel_fische[7] = H;
		kugel_fische[8] = I;
		kugel_fische[9] = J;
		
		sayan_zoo.aquarium[1].setTiere(kugel_fische);
		
		
		
		//Schritt 6
		//2 Walhaie
		Tier[] walhaie = new Tier[2];
		Walhai Moby = new Walhai("Moby",7,sayan_zoo,sayan_zoo.aquarium[0]);
		Walhai Dick = new Walhai("Dick",7,sayan_zoo,sayan_zoo.aquarium[0]);
		
		walhaie[0] = Moby;
		walhaie[1] = Dick;
		
		sayan_zoo.aquarium[0].setTiere(walhaie);
		
		
		
		//Schritt 7
		//Adler
		Tier[] adler = new Tier[2];
		Adler American = new Adler("American",7,sayan_zoo,sayan_zoo.vogelgehege[1]);
		Adler Dream = new Adler("Dream",7,sayan_zoo,sayan_zoo.vogelgehege[1]);
		
		adler[0] = American;
		adler[1] = Dream;
		
		sayan_zoo.vogelgehege[1].setTiere(adler);
		
		
		
		//Schritt 8
		//Personal muss noch gemacht werden Ramsay betreut LandsäugeTiere
		//Sam ->Wassertiere, Deanerys -> Vögel
		Personal[] a = new Personal[3];
		Personal Ramsay = new Personal("Ramsay", 22,sayan_zoo);
		Personal Sam = new Personal("Sam", 32,sayan_zoo);
		Personal Daenerys = new Personal("Daenerys", 25,sayan_zoo);
		a[0] = Ramsay;
		a[1] = Sam;
		a[2] = Daenerys;
		
		sayan_zoo.setAngestellte(a);
	
//		Ramsay.betreut(land_saeuge_array);
		
		int counter = 0;
		Tier[] wasser_tier_array = new WasserTier[walhaie.length+kugel_fische.length];
		for(int l = 0; l<= walhaie.length+kugel_fische.length-1; l++) {
			if(l< walhaie.length) {
				wasser_tier_array[l] = walhaie[l];	
			} 
			else {
				wasser_tier_array[l] = kugel_fische[counter];
				counter++;
			}	
		}
		Ramsay.betreut(sayan_zoo.landsaeugetiergehege);
		Sam.betreut(sayan_zoo.aquarium);
		Daenerys.betreut(sayan_zoo.vogelgehege);
		
		//System.out.println( sayan_zoo.vogelgehege[0].getTiere().length);
		
		
		
		
		//Schritt 9
		//Besucher
		
		Besucher Caitlyn = new Besucher("Caitlyn", 22);
		Besucher Aerys = new Besucher("Aerys", 22);
		Besucher Bronn = new Besucher("Bronn", 22);
		Besucher Sansa = new Besucher("Sansa", 22);
		Besucher Willy = new Besucher("Willy", 22);
		
		
		//System.out.println(sayan_zoo.aquarium[0].getName());
		
		Caitlyn.besucht(sayan_zoo.landsaeugetiergehege[2]);
		Aerys.besucht(sayan_zoo.vogelgehege[1]);
		Bronn.besucht(sayan_zoo.aquarium[1]);
		Sansa.besucht(sayan_zoo.aquarium[0]);
		Willy.besucht(sayan_zoo.landsaeugetiergehege[1]);
		Willy.besucht(sayan_zoo.aquarium[1]);
		
		
		
		
		
		
		
		//Test 
		System.out.println("\nTests:\n");
		Dream.fuettere(Ramsay);
		/*
		/////Zoo kreation
		Zoo sayan_zoo = new Zoo("SayanZoo",null,null);
		
		String[] gehege_names = new String[4];
		gehege_names[0] = "Ultima Gehege";
		gehege_names[1] = "Super Gehege";
		gehege_names[2] = "Steppe";
		
		sayan_zoo.setVogelgehege(gehege_names, sayan_zoo,3);
		
		/////Personal kreation
			Personal Seymor = new Personal("Seymor", 22,sayan_zoo);
			Personal Biggs = new Personal("Biggs", 32,sayan_zoo);
			Personal Wedge = new Personal("Wedge", 25,sayan_zoo);
			
			Personal[] a = new Personal[3];
			
			a[0] = Seymor;
			a[1] = Biggs;
			a[2] = Wedge;
			
			sayan_zoo.setAngestellte(a);
	
		/////Tier kreation
			Adler Squardo = new Adler("Squardo", 3, sayan_zoo, sayan_zoo.vogelgehege);
			Adler Tick = new Adler("Tick", 3,sayan_zoo,sayan_zoo.vogelgehege);
			
			Tier[] b = new Tier[3];
			b[0] = Squardo;
			b[1] = Tick;
		
			sayan_zoo.setTiere(b);
			sayan_zoo.vogelgehege[0].setTiere(b);

			
		/////Outputs
	
		
		//System.out.println(sayan_zoo.getName()+" "+sayan_zoo.getAngestellte()[2].getName());
		System.out.println(sayan_zoo.vogelgehege[0].getTiere()[1].getName()+" "+sayan_zoo.getTiere()[0].getName());
	
	
		*/
	}

}
