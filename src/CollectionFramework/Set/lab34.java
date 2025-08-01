package src.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab34 {

    public static void main(String[] args) {

        // Set:
        // It stored only unique value
        // Set is a interface
        // Hashset Does not maintain any order.


        Set fruits = new HashSet();
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("apple");
        fruits.add("Watermelon");  // Duplicate value is not allowed in set or Hashset

//        System.out.println(fruits);
//        System.out.println(fruits.isEmpty());
//        System.out.println(fruits.size());
//        System.out.println(fruits.contains("apple"));


       Iterator it = fruits.iterator();
           while (it.hasNext()){
               System.out.println(it.next());
           }


        System.out.println("--------------------");

        for (Object Obj : fruits){
            System.out.println(Obj);
        }
























    }

}
