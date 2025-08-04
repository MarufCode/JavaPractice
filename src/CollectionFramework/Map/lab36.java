package src.CollectionFramework.Map;

import java.util.*;

public class lab36 {

    public static void main(String[] args) {

        // HashMap -> RK : Random Keys and values Order
        // Linked HashMap -> NK: Natural Keys and values Order
        // Tree Map -> SK : Sorting Keys NOT VALUES or Order

        Map <String, Integer> map = new HashMap<>();
//        Map <String, Integer> map = new LinkedHashMap<>();
//        Map <String, Integer> map = new TreeMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 3);



        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(12));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());


        for(Map.Entry<String, Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }












    }
}
