package src.CollectionFramework.Generics;

import java.util.ArrayList;
import java.util.List;

public class lab37 {
    public static void main(String[] args) {

        // Use diamond Operator to restrict the data
        // List <Integer> myList = new ArrayList(); -> That means it is non- Generic and we have
//                                                     specified it with Integer only.

        // ByDefault it is Object as shown in below example


        List myList = new ArrayList();

        myList.add("maruf");
        myList.add("CSK");
        myList.add(45);

        System.out.println(myList);













    }
}
