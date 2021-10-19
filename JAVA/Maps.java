import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        /* Map is a data structure that is in a key-value pair form */
        Map<String, String> map = new HashMap<>();
        map.put("FullName", "Onikoyi Damola Olutoba");
        map.put("College", "Obafemi Awolowo University");
        map.put("Company", "Google");
        System.out.println(map);
        System.out.println();

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Apple Product", "macbook pro");
        treeMap.put("Android device", "Android S10");
        treeMap.put("Department", "Computer Science & engineering");
        System.out.println(treeMap);
        System.out.println();

        Map<Integer, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1997, 3);
        linkedMap.put(2016, 30);
        System.out.println(linkedMap.containsValue(3));
        System.out.println(linkedMap.containsKey(1995));
        System.out.println(linkedMap);

    }
}
