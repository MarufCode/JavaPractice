package src.CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {

        List <String> myList = new LinkedList();

        myList.add("Maruf");
        myList.add("Mahi Bhai");



        for (Object o :  myList){
            System.out.println(o);
        }

        List <Integer> myIntList = new LinkedList();
        myIntList.add(0);
        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(7);


        for (Object mil : myIntList){
            System.out.println(mil);
        }



    }
}
