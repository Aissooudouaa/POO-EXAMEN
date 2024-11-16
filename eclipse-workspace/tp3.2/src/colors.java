import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class colors {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("rose");
		color.add("bleu");
		color.add("vert");
		color.add("rouge");
		color.add("noir");
		
		//affichage de la collection
		Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	  
        //ajout d'une couleur
        
        color.add(0, "blanc");
        
        System.out.println("Affichage de couleurs apres ajout:");
        for (int i=0; i<color.size(); i++) {
            System.out.println(color.get(i));
        }
        
        //ordonner les éléments
        
        for(int i=0; i<color.size();i++) {
        	
        	if(color.get(i).equals("blanc")) {
        		color.set(i, "mm");
        		
        	}
        }
        
        Collections.sort(color);
        
        //affichage apr modification
        
        System.out.println("Affichage de couleurs apr modification:");
        for (int i=0; i<color.size(); i++) {
            System.out.println(color.get(i));
        }
        
        
        
        
        
        
        /*
          LinkedList<String> colorLinkedList = new LinkedList<>();
        colorLinkedList.add("Rouge");
        colorLinkedList.add("Bleu");
        colorLinkedList.add("Vert");
        colorLinkedList.add("Jaune");

        // Ajouter une couleur à la première position
        colorLinkedList.addFirst("Noir");

        // Modifier un élément de la LinkedList
        if (colorLinkedList.contains(colorord)) {
            ListIterator<String> iterator = colorLinkedList.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(oldColor)) {
                    iterator.set(newColor);
                }
            }
        }

        // Trier les éléments de la LinkedList
        Collections.sort(colorLinkedList);

        // Afficher la LinkedList
        System.out.println("LinkedList de couleurs :");
        for (String color : colorLinkedList) {
            System.out.println(color);
        }
         */
        
        
	}
	
}
