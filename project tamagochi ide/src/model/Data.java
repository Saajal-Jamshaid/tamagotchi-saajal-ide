package model;

public class Data {
	
	public static String nom;
	public static int age;
	public static int palierAge;
	
	public static int fatigue;
	public static int vie;
	public static int faim;
	public static int proprete;
	public static int energie;
	public static int humeur;
	public static int sorti;
	public static int force;
	public static int victoire;
	
	public static boolean content;

	
	public static int chanceFin = 0;
	public static boolean menuOn;
	
	public static void carress(){
		System.out.println("Vous commencez a carresser " + Personnage.nom + " , il est heureux !");
		Personnage.sorti = 0;
		energie = force + humeur - faim - fatigue ; fatigue = 0;
	}
	
	public static void nourrir(){
		System.out.println(Personnage.nom + " a bien mangé son casse-croute !");
		moinsFaim(10);
		if (force > 0) {
			force --;
		}
	}
	
	public static void laver(){
		System.out.println(Personnage.nom + " a ete lave correctement !");
		plusPopre(10);
	}
	
	public static void sortir(){
		System.out.println("Vous laissez " + Personnage.nom + " sortir.");
		Personnage.fatigue ++;
		Personnage.energie --;
	}
	
	public static void rentrer(){
		System.out.println("Vous appelez " + Personnage.nom + " pour qu'il rentre.");
		plusSortie(10);
	}
	
	public static void stats(){
		System.out.println("Nom : " + Personnage.nom);
		if(Personnage.palierAge == 1) System.out.println("Age: " + Personnage.age + " ans" + " (Bebe)");
		else if(Personnage.palierAge == 2) System.out.println("Age: " + Personnage.age + " ans" + " (Enfant)");
		else if(Personnage.palierAge == 3) System.out.println("Age: " + Personnage.age + " ans" + " (Adulte)");
		else if(Personnage.palierAge == 4) System.out.println("Age: " + Personnage.age + " ans" + "  (Age(e))");
		System.out.println("Vie : " + Personnage.vie + " /10");
		System.out.println("Faim : " + Personnage.faim + " /10");
		System.out.println("Energie : " + Personnage.energie + " /10");
		System.out.println("Fatigue : " + Personnage.fatigue + " /10");
		System.out.println("Humeur : " + Personnage.humeur + " /10");
		System.out.println("Proprete : " + Personnage.proprete + " /10");
		System.out.println("Force : " + Data.force);
		System.out.println("Victoire : " + Data.victoire);
	}
	
	public static void moinsEnergie(int e){
		if(Personnage.energie - e < 0) Personnage.energie = 0;
		else Personnage.energie -= e;
	}
	
	public static void plusEnergie(int e){
		if(Personnage.energie + e > 100) Personnage.energie = 100;
		else Personnage.energie += e;
	}
	
	public static void moinsFaim(int f){
		if(Personnage.faim - f < 0) Personnage.faim = 0;
		else Personnage.faim -= f;
	}
	
	public static void plusFaim(int f){
		if(Personnage.faim + f > 10) Personnage.faim = 10;
		else Personnage.faim += f;
	}
	
	public static void moinsPropre(int p){
		if(Personnage.proprete - p < 0) Personnage.proprete = 0;
		else Personnage.proprete -= p;
	}
	
	public static void plusPopre(int p){
		if(Personnage.proprete + p > 10) Personnage.proprete = 10;
		else Personnage.proprete += p;
	}
	
	public static void moinsVie(int v){
		if(Personnage.vie - v < 0) Personnage.vie = 0;
		else Personnage.vie -= v;
	}
	
	public static void plusVie(int v){
		if(Personnage.vie + v > 10) Personnage.vie = 10;
		else Personnage.vie += v;
	}
	
	public static void moinsHumeur(int h){
		if(Personnage.humeur - h < 0) Personnage.humeur = 0;
		else Personnage.humeur -= h;
	}
	
	public static void plusHumeur(int h){
		if(Personnage.humeur + h > 10) Personnage.humeur = 10;
		else Personnage.humeur += h;
	}
	
	public static void moinsSortie(int s){
		if(Personnage.sorti - s < 0) Personnage.sorti = 0;
		else Personnage.sorti -= s;
	}
	
	public static void plusSortie(int s){
		if(Personnage.sorti + s > 10) Personnage.sorti = 10;
		else Personnage.sorti += s;
	}
	
	public static void plusFatigue(int f){
		if(Personnage.fatigue + f > 10) Personnage.fatigue = 10;
		else Personnage.fatigue += f;
	}
	
	public static void moinsFatigue(int f){
		if(Personnage.fatigue - f > 10) Personnage.fatigue = 0;
		else Personnage.fatigue -= f;
	}
	
	public static void plusForce(int f){
		if(Personnage.fatigue + f > 10) Personnage.fatigue = 10;
		else Personnage.fatigue += f;
	}
	
	public static void moinsForce(int f){
		if(Personnage.fatigue - f > 10) Personnage.fatigue = 0;
		else Personnage.fatigue -= f;
	}

}
