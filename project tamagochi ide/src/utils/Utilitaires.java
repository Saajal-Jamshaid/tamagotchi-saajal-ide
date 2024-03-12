package utils;

import java.util.Random;

import model.Data;

import model.Personnage;

public class Utilitaires {
	
	private static Random random = new Random();
	
	public static void jeux(){
		if(Personnage.vie >= 75 && Personnage.faim <= 4 && Personnage.energie >= 5 && Personnage.humeur >= 6 && Personnage.sorti <= 10) Personnage.content = true;
		else Personnage.content = false;
		
		Personnage.age++;
		if(Personnage.age == 10){
			Personnage.palierAge++;
			System.out.println("Felicitations! " + Personnage.nom + " est devenu un Adolescent" + " il a maintenant " + Personnage.age + " ans");
		}else if(Personnage.age == 18){
			Personnage.palierAge++;
			System.out.println("Felicitations! " + Personnage.nom + " est devenu un Jeune Adulte" + " il a maintenant " + Personnage.age + " ans");
		}else if(Personnage.age == 25){
			Personnage.palierAge++;
			System.out.println("Felicitations! " + Personnage.nom + " est devenu un Adulte" + " il a maintenant " + Personnage.age + " ans");
		}else if(Personnage.age == 70){
			Personnage.palierAge++;
			System.out.println("Felicitations! " + Personnage.nom + " est devenu une Personne Agee" + " il a maintenant " + Personnage.age + " ans");
		}
		if(Personnage.age >= 70){
			Personnage.chanceFin++;
			if(getRandom().nextInt(100) <= Personnage.chanceFin){
				System.out.println(Personnage.nom + " est mort a l'age de " + Personnage.age + ". Il reposera en paix");
				Personnage.menuOn = false;
			}
		}
						
			if(Personnage.vie < 5) System.out.println(Personnage.nom  + " n'est pas en bonne posture !");
			if(Personnage.vie < 2) System.out.println(Personnage.nom  + " est tres mal en point !");
			if(Personnage.faim >= 5) System.out.println(Personnage.nom  + " a faim !");
			
			if(Personnage.faim == 0){
				Data.moinsHumeur(1);
				System.out.println(Personnage.nom  + " a beaucoup trop mange ! il a le ventre rempli !");
			}
			
			if(Personnage.humeur < 2) System.out.println(Personnage.nom  + " est pas content !");
		}
	
		{ if(Personnage.faim > 7) {
			Personnage.humeur --;
			Personnage.fatigue ++;
			Personnage.energie --;
		}
		}
		
		{if(Personnage.fatigue > 7) {
			Personnage.force --;
			Personnage.energie --;
		}
		}
		
		{if(Personnage.proprete < 3) {
			Personnage.humeur --;
			Personnage.force --;
			Personnage.energie --;
		}
		}
		
		{ if(Personnage.humeur < 3) {
			Personnage.force --;
			Personnage.fatigue ++;
			Personnage.energie --;
		}
		}
		
			
		{ if (Personnage.vie <= 0) Personnage.menuOn = false;
	}

	public static Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		Utilitaires.random = random;
	}

}
