package model;

import java.util.Random;
import java.util.Scanner;

public class Ennemi {

    Scanner in = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static int ennemiDegatInfliger = rand.nextInt(5);

    public String[] enemies = {"Pikachu", "Bulbizarre", "Carapuce", "Salameche", "Tortank", "Goupix"};
    public String ennemi = enemies[rand.nextInt(enemies.length)];


    int ennemiVie = rand.nextInt(10) + 10;
}
