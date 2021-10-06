  package hogwarts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap <String, Integer> hellos = new HashMap<String, Integer>();

	        String action, text, key;
	        int id;
			action = "";


	        hellos.put("Gryffondor", "0");
	        hellos.put("Poufsouffle", "0");
	        hellos.put("Serdaigle", "0");
	        hellos.put("Serpentard", "0");


	        Iterator<String> iterator;

	        while (!action.equals("QUIT")) {

	            System.out.println("\nBienvenue à Poudlard ! \n - Tapez '+' pour ajouter un élément au tableau. \n - Tapez '-' pour en retirer. \n - Tapez 'GET' pour afficher le tableau. \n - Tapez 'SIZE' pour connaître la taille du tableau. \n - Tapez 'QUIT' pour quitter le programme.");
	            action = sc.next();

	            if (action.equals("+") || action.equals("-")) {
	                System.out.println("Saisir l'identifiant :");

	                id = sc.nextInt();

	                if (action.equals("+")) {
	                    System.out.println("Saisir le texte :");
	                    text = sc.next();
	                    hellos.put(id, text);

	                } else if (action.equals("-")) {
	                    if (hellos.get(id) != null) {
	                        hellos.remove(id);
	                    } else {
	                        System.out.println("La clé " + id + " n'existe pas.");
	                    }

	                } 
	            } else if (action.equals("GET")) {
	                iterator = hellos.keySet().iterator();
	                while (iterator.hasNext()) {
	                    key = iterator.next();
	                    System.out.println(key + " | " + hellos.get(key));
	                };
	                
	            } else if (action.equals("SIZE")) {
	                System.out.println("Taille : " + hellos.size());
	            }
	        }

	    }
}
