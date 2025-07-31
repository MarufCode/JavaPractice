package src.CollectionFramework.List;

import java.util.List;

public class ListExample01 {
    public static void main(String[] args) {

        // Collection Framework

        List fruits =  List.of("apple", "banana", "Orange","apple", "watermelon");
        List shopping_items = List.of("AATA", "Butter", "BREAD", "MILK");
        List my_10_marks = List.of(89, 87, 54, 78, 96);
        List diff_data_types = List.of("Maruf", true, 123);

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("watermelon"));
        System.out.println(fruits.isEmpty());

        fruits.add("muskmelon");











    }

}
