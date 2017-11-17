import java.util.*;

public class MapUtil {
    public static <K, V extends Comparable<? super V>> Map<K, V> 
        sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return -(o1.getValue()).compareTo( o2.getValue() ); //ordem decrescente
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    
    static <K> void printRandomText(Map<K, Integer> map){
        List<K> list = new ArrayList<K>(map.keySet());
        Collections.shuffle(list);
        for(int i=0;i<list.size();i++){
            K element = list.get(i);
            System.out.print(element + " ");
        }
    }
}