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
		Zoo sayan_zoo = new Zoo("SayanZoo");
		
		
		//Aufg 2 Schritt 1
		//3 Vogelgehege werden hier erzeugt
		String[] vogel_gehege_names = new String[3];
		vogel_gehege_names[0] = "Papageiengehege";
		vogel_gehege_names[1] = "Adlergehege";
		vogel_gehege_names[2] = "Pinguingehege";
		
		sayan_zoo.addGehegeArray(1, vogel_gehege_names, 3, sayan_zoo);
		
		//3 Landsaeugetiergehege werden hier erzeugt
		String[] landsaeugetier_gehege_names = new String[3];
		landsaeugetier_gehege_names[0] = "Steppe";
		landsaeugetier_gehege_names[1] = "Wald";
		landsaeugetier_gehege_names[2] = "Wueste";
		
		
		sayan_zoo.addGehegeArray(2, landsaeugetier_gehege_names, 3, sayan_zoo);
		
		//2 Aquarien werden hier erzeugt
		String[] aqua_gehege_names = new String[2];
		aqua_gehege_names[0] = "Walhaibecken";
		aqua_gehege_names[1] = "Kugelfischtank";
		
		sayan_zoo.addGehegeArray(3, aqua_gehege_names, 2, sayan_zoo);
		//getestet ob remove geht
		//sayan_zoo.removeGehege("Walhaibecken");
	
		//Aufg 2 Schritt 2
		System.out.print("\nSchritt 2:\n");
		Tier[] papas = new Tier[3];
		Papagei Tick = new Papagei("Tick",sayan_zoo);
		Papagei Trick = new Papagei("Trick",sayan_zoo);
		Papagei Track = new Papagei("Track",sayan_zoo);
		
		papas[0] = Tick;
		papas[1] = Trick;
		papas[2] = Track;
		
		
		sayan_zoo.addTier(papas[1], vogel_gehege_names[0]);
		sayan_zoo.addTier(papas[2], vogel_gehege_names[0]);
		sayan_zoo.addTier(papas[0], vogel_gehege_names[0]);
		
		//Schritt 3
				//4 loewn alle in die Wueste
				System.out.print("\nSchritt 3:\n");
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
				System.out.print("\nSchritt 4:\n");
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
				
				//addtier in LansaugeTierGehege unterscheidet jz zw LansÃ¤ugetieren und keinen (Loewe und Zebra ist white-listet)
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
				
				for(int fisch = 0; fisch < kugel_fische.length; fisch++) {
					kugel_fische[fisch] = new KugelFisch("Fisch"+ fisch, sayan_zoo);
					sayan_zoo.addTier(kugel_fische[fisch], "Kugelfischtank");
				}

				//Schritt 6
				//2 Walhaie
				System.out.print("\nSchritt 6:\n");
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
				System.out.print("\nSchritt 8:\n");
				
				//betreutes Gehegearray wird direkt über den Konstruktor übergeben
				Personal[] a = new Personal[3];
				Personal Ramsay = new Personal("Ramsay",sayan_zoo, sayan_zoo.getGehegeTypeArr(2));
				Personal Sam = new Personal("Sam",sayan_zoo, sayan_zoo.getGehegeTypeArr(3));
				Personal Daenerys = new Personal("Daenerys",sayan_zoo, sayan_zoo.getGehegeTypeArr(1));
						
				a[0] = Ramsay;
				a[1] = Sam;
				a[2] = Daenerys;
		
				//Schritt 9
				//Besucher
				System.out.print("\nSchritt 9:\n");
				
				Besucher Caitlyn = new Besucher("Caitlyn",sayan_zoo.getGehege("Wueste"));
				Besucher Aerys = new Besucher("Aerys",sayan_zoo.getGehege("Adlergehege"));
				Besucher Bronn = new Besucher("Bronn",sayan_zoo.getGehege(aqua_gehege_names[1]));
				Besucher Sansa = new Besucher("Sansa",sayan_zoo.getGehege(aqua_gehege_names[0]));
				Besucher Willy = new Besucher("Willy",sayan_zoo.getGehege("Steppe"));
				
				Willy.besucht(sayan_zoo.getGehege(aqua_gehege_names[1]));
				
				Besucher[] besucher_arr = new Besucher[5];
				besucher_arr[0] = Caitlyn;
				besucher_arr[1] = Aerys;
				besucher_arr[2] = Bronn;
				besucher_arr[3] = Sansa;
				besucher_arr[4] = Willy;
				
		
				sayan_zoo.outputZustand();
				
				//Test 
						System.out.println("\nTests:\n");
						Dream.fuettere(Ramsay);
	
		}
		
		
	

}
