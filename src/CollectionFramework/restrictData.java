package src.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class restrictData {
    public static void main(String[] args) {

        // Collection Framework

        // Restrict the data with diamond Operator

        List <String> mylist = new ArrayList();
        mylist.add("Maruf");
        mylist.add("Vicky");
//        mylist.add(true);
//        mylist.add(123);
        System.out.println(mylist);

        mylist.set(1, "Nasir");
        System.out.println(mylist);
        mylist.remove("Nasir");
        System.out.println(mylist);



        // iterate
//        for (int i = 0; i<mylist.size(); i++){
//            System.out.println(mylist.get(i));
//        }


        // For each Loop

        for (String o : mylist){
            System.out.println(o);
        }











    }

}
