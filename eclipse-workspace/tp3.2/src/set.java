import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class set {
	public static void main(String[] args) {
	HashSet<Integer> hs1 = new HashSet<Integer>();
	hs1.add(5);
	hs1.add(4);
	hs1.add(9);
	hs1.add(10);
	
	HashSet<Integer> hs2 = new HashSet<Integer>();
	hs2.add(3);
	hs2.add(7);
	hs2.add(10);
	hs2.add(9);
	
	//les éléments identiques

	
	
	hs1.retainAll(hs2);
			System.out.println("Éléments identiques sont: " + hs1);
	

	
	//vérification si vide ou non
			
			 if(hs1.isEmpty()) {
			System.out.println("Hashset est  vide");
			 }else {		System.out.println("Hashset n'est pas vide");
			 }
	/*
    if(hs1.size()>0) {
		System.out.println("Hashset n'est pas vide");
	//else {
		//System.out.println("Hashset est vide");
		
	//}
	/*
	 if(!identique.isEmpty()){
	 System.out.println("Hashset n'est pas vide");
	}else {
		System.out.println("Hashset est vide");
	}*/
    
    // Convertion le HashSet en tableau
    Integer[] tab = new Integer[hs1.size()];
    hs1.toArray(tab);
    
    //convertion en treeset
    
    TreeSet <Integer> ts2 = new TreeSet<Integer>(hs2);
    
    //parcours
    
    Iterator<Integer> iterator = ts2.iterator();
    System.out.println("les éléments de treeset sont :");
    while (iterator.hasNext()) {
        System.out.println(+iterator.next());
    }
	
    
    int dernier = ts2.last();
    System.out.println("Dernier élément de TreeSet est  : " + dernier);
    ts2.remove(dernier);
    
    // Affichage du TreeSet après suppression
      System.out.println("TreeSet après suppression : " +ts2);
    
    //}else {
		//System.out.println("Hashset est vide");
		

	}}//}
	
	
	
		
	

