import java.util.HashMap;
import java.util.TreeMap;

public class hashmap {
	public static void main(String[] args) {
		
	HashMap <Integer,String> map1 =new HashMap<Integer,String>();
	HashMap <Integer,String> map2 =new HashMap<Integer,String>();
	
	map1.put(1, "a");
	map1.put(2, "b");
	map1.put(3, "c");
	
	//copy
	map2.putAll(map1);
	
	//affichage
	
	System.out.println("Les éléments de map1 sont:" +map1);
	System.out.println("Les éléments de map2 sont:" +map2);
	
	//vide
	if(map1.isEmpty()) {
		System.out.println("Hashmap est vide ");
	}else {
		System.out.println("Hashmap n'est pas vide ");
	
	
	}
	//2affichage clé-valeur
	
	TreeMap<Integer,String> tp3 =new TreeMap<Integer,String>();
	
   tp3.put(1,"K");
   tp3.put(2,"L");
   tp3.put(3,"M");
   System.out.println( " clé-valeur associée à la plus petite clé supérieure ou égale à la clé donnée est:"+tp3.ceilingEntry(6));

   System.out.println( " clé-valeur associée à la plus petite clé supérieure ou égale à la clé donnée est:"+tp3.ceilingEntry(1));
}}
