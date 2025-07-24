package src.exceptions.checked;

import java.io.FileInputStream;

public class lab26 {
    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("stx.txt");


        }catch (Exception e){
            System.out.println("NOooooooo");
        }

        System.out.println("Hello");







    }
}
