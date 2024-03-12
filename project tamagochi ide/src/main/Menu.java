package main;

import java.util.Random;
import java.util.Scanner;


import model.Data;
import model.Personnage;
import utils.Sauvegarde;
import utils.Utilitaires;

public class Menu {

	private static Scanner scanner;
	
	public static Personnage joueur;
	public static int tours = 0;
		
	public Menu(){
		scanner = new Scanner(System.in);
		init();
	}
	
	private static void init(){
		System.out.println("Bonjour et Bienvenue sur le Tamagotchi !");
		String name = "";		
		
		while(name == ""){
			System.out.println("Choisissez un nom : ");
			String in = scanner.nextLine();
			if(in.length() > 0) name = in;
		}
		joueur = new Personnage(name);
	}
	
	public static void start(){
		while(Personnage.menuOn){
			System.out.println("Voici votre Tamagotchi !");
			System.out.println("Age: " + Personnage.age + " ans" + " (Bebe)");
			System.out.println("  .^._.^.\r\n"
					+ "  | . . |\r\n"
					+ " (  ---  )\r\n"
					+ " .'     '.\r\n"
					+ " |/     \\|\r\n"
					+ "  \\ /-\\ /\r\n"
					+ "   V   V");
				System.out.println(Personnage.nom + " est heureux.");
				System.out.println("Que voulez-vous faire a " + "\u001B[31m" + Personnage.nom + "\u001B[0m" + " ?" + "\n");
				System.out.println("1 - Nourir");
				System.out.println("2 - Carresser");
				System.out.println("3 - Sortir");
				System.out.println("4 - Statistique");
				System.out.println("5 - Laver");
				System.out.println("6 - Combat");
				System.out.println("7 - info projet");
				System.out.println("8 - Sauvegarde");
				System.out.println("9 - Exit");
				
				int choixMenu = saisieInt();
				
				if(Personnage.energie > 0) {
					switch (choixMenu) {
					case 1 :
					Data.nourrir();
					nbTours();
					break;
					case 2 :
					Data.carress();
					Data.plusFaim(+1);
					Data.moinsPropre(+1);
					nbTours();
					break;
					case 3 :
					Data.sortir();
					Data.plusFaim(+1);
					Data.moinsPropre(+1);
					nbTours();
					break;
					case 4 :
					Data.stats();
					break;
					case 5 :
					Data.laver();
					Data.plusFaim(+1);
					Data.moinsPropre(+1);
					nbTours();
					break;
					case 6 :
					combatPokemon();
					nbTours();
					break;
					case 7 :
					information();
					break;
					case 8 :
					Sauvegarde.sauvegarde(null);
					break;
					case 9 :
					System.out.println("Au revoir");
					System.exit(0);
					break;
					}
				}
			
		}
		init();
	}
	
	private static void combatPokemon() {
		Random rand = new Random();
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        boolean MenuOn = true;

       
        model.Joueur Joueur = new model.Joueur();
        model.Ennemi Ennemi = new model.Ennemi();

        Joueur.vie();
        int ennemiVie;

        while (MenuOn) {

            String[] enemies = {"Pikachu", "Bulbizarre", "Carapuce", "Salameche", "Tortank", "Goupix"};
            String ennemi = enemies[rand.nextInt(enemies.length)];
            ennemiVie = rand.nextInt(2) + 10;
            Joueur.ennemiVie = ennemiVie;
            System.out.println("le pokemon " + ennemi + " est apparu !!" + "\n");

            Data.vie = Joueur.vie();

            while (ennemiVie > 0) {

                ennemiVie = Joueur.ennemiVie;
                if (ennemiVie < 1) {
                    break;
                }

                if (Data.vie < 1) {
                    System.out.println("Votre Tamagotchi " + Personnage.nom + "est malheuresement décédé sous les coups");
                    break;
                }


                Data.vie = Joueur.vie();

                System.out.println("Vous avez " + "\u001B[31m" + Personnage.vie + "\u001B[0m" + " de vie");
                System.out.println("Votre Ennemi a " + "\u001B[31m" + ennemiVie + "\u001B[0m" + " de vie " + "\n");
                System.out.println("Que voulez-vous faire ?" + "\n");
                System.out.println("1 - Attaquer l'Ennemi");
                System.out.println("2 - Vous soignez");
                System.out.println("3 - Esquiver");
                
                int choixMenu = saisieInt();
                
                switch (choixMenu) {
                    case 1:
                        Joueur.attaque();
                        nbTours();
                        break;
                    case 2:
                    System.out.println("Vous buvez une RedBull et vous avez recu 2 PV.");
                    Data.plusVie(+2);
                    nbTours();
                    break;
                    case 3:
                    System.out.println("Vous esquivez de justesse votre Ennemi");
                    nbTours();
                    break;

                }
            }
            if (ennemiVie < 1) {

            	Data.vie = Joueur.vie();
                System.out.println("\n" + "Fin du combat, place au résultat :");
                Data.force ++;
                Data.victoire ++;
                System.out.println("Votre ennemi " + "\u001B[0m" + ennemi + "\u001B[0m" + " a ete battu !");
                System.out.println("Cependant il vous reste " + "\u001B[31m" + Personnage.vie + "\u001B[0m" + " de vie." + "\n");
                System.out.println("Pendant votre combat, vous avez acquis de la force");
                System.out.println("Vous etes actuellement a " + "\u001B[31m" + Data.victoire + "\u001B[0m" + " victoire." + "\n");

                System.out.println("Que voulez-vous faire " + "\u001B[31m" + Personnage.nom + "\u001B[0m" + " ?" + "\n");
                System.out.println("1 - Continuer les combats");
                System.out.println("2 - Sortir du Combat");

                int choixMenu = saisieInt();

                switch (choixMenu) {
                    case 1:
                        System.out.println("Vous continuez sur votre lancez !!");
                        nbTours();
                        break;
                    case 2:
                        System.out.println("Vous avez quitter le Combat");
                        break;
                }
                if (choixMenu == 2) {
                	nbTours();
                	break;
                }
            }
        }
    }

	private static int saisieInt() {
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Erreur de saisie");
			return 0;
		}
	}
	
	public static void information(){
		System.out.println("Projet crée pour le projet en java par Saajal");
		System.out.println("Projet regroupant le Tamagotchi et Pokemon");
		System.out.println("B1B");
	}

	public static void nbTours(){
		Utilitaires.jeux();
		tours++;
	}
	
}