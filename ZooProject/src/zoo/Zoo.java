package zoo;

import zoo.Gehege.Aquarium;
import zoo.Gehege.LandsaeugeTierGehege;
import zoo.Gehege.Vogelgehege;
import zoo.Personen.Personal;
import zoo.Tier.Tier;

public class Zoo {
	
	private String name;
	private static int gehege_count = 0; //zählt ab ob max Gehege erreicht wurden
	
	public Vogelgehege[] vogelgehege;
	public LandsaeugeTierGehege[] landsaeugetiergehege;
	public Aquarium[] aquarium;
	
	private Tier[] tiere;
	private Personal[] angestellte;
	
	public Zoo(String name, Tier[] tiere, Personal[] angestellte) {
		
		this.setName(name);
		this.setTiere(tiere);
		this.setAngestellte(angestellte);
		
		this.vogelgehege = new Vogelgehege[10];
		this.landsaeugetiergehege = new LandsaeugeTierGehege[10];
		this.aquarium = new Aquarium[10];
		
		}
		
	
	/////name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	//////Personal
	public Personal[] getAngestellte() {
		return angestellte;
	}
	public void setAngestellte(Personal[] angestellte) {
		this.angestellte = angestellte;
	}
	
	////////Tier zuordnen
	public Tier[] getTiere() {
		return tiere;
	}
	public void setTiere(Tier[] tiere) {
		this.tiere = tiere;
	}
	
	//Die einzelnen Gehege werden als Komposition erstellt -> also abhängig von Zoo
	//wenn gehege_count bis 10 hochgezählt hat sagt er am Ende Bescheid
	
	public void setVogelgehege(String[] name, Zoo zoo, int vogel_gehege_count) {
		
		for(int i=0; i<vogel_gehege_count; i++) {
			
			if(gehege_count < 9) {
			
				this.vogelgehege[i] = new Vogelgehege(name[i],zoo);
				System.out.println(this.name+" "+"hat jetzt ein neues Vogelgehege mit der Bezeichnung"+" "+name[i]);
				gehege_count++;
				if(gehege_count == 9) {
					System.out.println(this.name+" "+"hat die max Gehegeanzahl erreicht");
				break;
				}
			}
			
		}
		
	}
	
public void setLandsaeugeTierGehege(String[] name, Zoo zoo, int landsaeuge_gehege_count) {
		
		for(int i=0; i<landsaeuge_gehege_count; i++) {
			
			if(gehege_count < 9) {
			
				this.landsaeugetiergehege[i] = new LandsaeugeTierGehege(name[i],zoo);
				System.out.println(this.name+" "+"hat jetzt ein neues Landsaeugetiergehege mit der Bezeichnung"+" "+name[i]);
				gehege_count++;
				if(gehege_count == 9) {
					System.out.println(this.name+" "+"hat die max Gehegeanzahl erreicht");
					break;
				}
			}
		}
		
	}

public void setAquarium(String[] name, Zoo zoo, int aqua_gehege_count) {
	
	for(int i=0; i<aqua_gehege_count; i++) {
		
		if(gehege_count < 9 ){
		
			this.aquarium[i] = new Aquarium(name[i],zoo);
			System.out.println(this.name+" "+"hat jetzt ein neues Aquarium mit der Bezeichnung"+" "+name[i]);
			gehege_count++;
		
			if(gehege_count == 9) {
				System.out.println(this.name+" "+"hat die max Gehegeanzahl erreicht");
				break;
			}
		}
	
	}
	
}
	
	
	

}
