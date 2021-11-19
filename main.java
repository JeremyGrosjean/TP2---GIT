  package hogwarts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap <String, Integer> hellos = new HashMap<String, Integer>();


	        String action, id, key;
			Integer text;
	        action = "";
			id="";

			hellos.put("Gryffondor", -50);
	        hellos.put("Poufsouffle", 55515);
	        hellos.put("Serdaigle", 601000);
	        hellos.put("Serpentard", 10);
			
	        Iterator<String> iterator;

	        while (!action.equals("QUIT")) {

	            System.out.println("\nBienvenue à Poudlard ! \n - Tapez '+' pour ajouter un élément au tableau. \n - Tapez '-' pour en retirer. \n - Tapez 'GET' pour afficher le tableau. \n - Tapez 'SIZE' pour connaître la taille du tableau. \n - Tapez 'QUIT' pour quitter le programme. \n Tapez 'DEL' pour supprimer une maison");
	            action = sc.next();

	            if (action.equals("+") || action.equals("-")) {
	                System.out.println("Saisir la Maison");

	                id = sc.next();

	                if (action.equals("+")) { 
	                    System.out.println("Ajouter les points :");
	                    text = sc.nextInt();
						Integer calc = hellos.get(id);
						calc = calc + text;
						hellos.put(id,calc);                    

	                } else if (action.equals("-")) {
	                    System.out.println("Retirer des points :");
	                    text = sc.nextInt();
						Integer calc = hellos.get(id);
						calc = calc - text;
						hellos.put(id,calc);						

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

				else if (action.equals("DEL")) {
					System.out.println("Saisir la Maison");
	                id = sc.next();

					if (hellos.get(id) != null) {
						hellos.remove(id);
					} else {
						System.out.println("La clé " + id + " n'existe pas.");
					}
				}
	        }

	    }
}
