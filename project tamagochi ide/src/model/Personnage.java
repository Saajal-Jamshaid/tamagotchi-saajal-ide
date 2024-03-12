package model;

public class Personnage {
	
	public static String nom;
	public static int age;
	public static int palierAge;
	
	public static int force;
	public static int fatigue;
	public static int vie;
	public static int faim;
	public static int proprete;
	public static int energie;
	public static int humeur;
	public static int sorti;
	public static int victoire;
	
	public static boolean content;
	
	public static int chanceFin = 0;
	public static boolean menuOn;
	
	public Personnage(String nom){
		Personnage.nom = nom;
		age = 0;
		palierAge = 1;
		faim = 0;
		proprete = 10;
		vie = 10;
		humeur = 10;
		sorti = 0;
		energie = 10;
		fatigue = 0;
		force = 0;
		victoire = 0;
		menuOn = true;
		System.out.println("Votre tamagotchi se nomme " + "\u001B[31m" + nom + "\u001B[0m" + "," + " il vient de naitre !");
	}

	public static boolean menuOn() {
		return menuOn;
	}

	
	
}