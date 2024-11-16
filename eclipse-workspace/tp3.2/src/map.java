import java.util.HashMap;
import java.util.TreeMap;


public class map {
	public static void main(String[] args) {
        // Programme 1
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("c",3 );
        HashMap<String, Integer> map2 = new HashMap<>();
  
        copyHashMap(map1, map2);
        
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println("map1 est vide: " + map1.isEmpty());
        
        // Programme 2
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, "B");
        treeMap.put(5, "C");
        
        System.out.println(getCeilingEntry(treeMap, 2));  // Doit retourner "B"
        System.out.println(getCeilingEntry(treeMap, 5));  // Doit retourner "C"
        System.out.println(getCeilingEntry(treeMap, 6));  // Doit retourner null
    }
    
    // Programme 1: Copier tous les mappings de map1 vers map2
    public static <K, V> void copyHashMap(HashMap<K, V> map1, HashMap<K, V> map2) {
        map2.putAll(map1);
    }
    
    // Programme 2: Obtenir la correspondance clé-valeur pour la plus petite clé supérieure ou égale à la clé donnée
    public static <K, V> V getCeilingEntry(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingEntry(key) != null ? treeMap.ceilingEntry(key).getValue() : null;
    }
}

