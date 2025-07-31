package src.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lab32 {
    public static void main(String[] args) {


        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("API");
        courseList.add("SDET Blueprint");

        ListIterator <String> listIterator = courseList.listIterator();

        System.out.println("Forward -- ");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Backward -- ");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }




    }
}
