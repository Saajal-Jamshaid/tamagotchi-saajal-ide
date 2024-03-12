package utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.Personnage;

public class Sauvegarde {
   public static void sauvegarde(String[] args) {
      BufferedWriter bw = null;
      try {
	 String mycontent = 
			 " _                                    _       _     _ \r\n"
			 + "| |                                  | |     | |   (_)\r\n"
			 + "| |_ __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ \r\n"
			 + "| __/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |\r\n"
			 + "| || (_| | | | | | | (_| | (_| | (_) | || (__| | | | |\r\n"
			 + " \\__\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|\r\n"
			 + "                           __/ |                      \r\n"
			 + "                          |___/                       " + "\n" +
		"Nom : " + Personnage.nom + "\n" +
	    "Energie : " + Personnage.energie + " /10" + "\n" +
	    "Force : " + Personnage.force + " /10" + "\n" +
	    "Humeur : " + Personnage.humeur + " /10" + "\n" +
	    "Faim : " + Personnage.faim + " /10" + "\n" +
	    "Fatigue : " + Personnage.fatigue + " /10" + "\n" +
	    "Proprete : " + Personnage.proprete + " /10" + "\n";
         
	 File file = new File("Tama.txt");

	 
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("Fichier sauvegarde avec success");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Erreur"+ex);
	    }
	}
   }
}