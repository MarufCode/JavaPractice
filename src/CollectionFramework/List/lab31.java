package src.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab31 {
    public static void main(String[] args) {

        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("API");
        courseList.add("SDET Blueprint");


        List numList = new ArrayList();
        numList.add(150);
        numList.add(200);
        numList.add(250);
        numList.add(250);

        courseList.addAll(numList);
        System.out.println(courseList);


        for (Object o : courseList){
            System.out.println(o);
        }

        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
