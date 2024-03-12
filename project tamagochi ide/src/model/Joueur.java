package model;

import java.util.Random;
import java.util.Scanner;

public class Joueur {

    model.Ennemi Ennemi = new model.Ennemi();

    Scanner in = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int ennemiDegat = model.Ennemi.ennemiDegatInfliger;
    public int ennemiVie = Ennemi.ennemiVie;
    int degatInfliger;

    public int vie() {
        return Data.vie = 10;
    }

    public void attaque() {

        degatInfliger = rand.nextInt(5);
        ennemiVie -= degatInfliger;
        Personnage.vie -= ennemiDegat;
        System.out.println("Vous avez inflige " + degatInfliger + " de degats");
        System.out.println("En retour vous avez recu " + ennemiDegat + " de degats");
    }
}