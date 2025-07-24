package src.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab28 {
    public static void main(String[] args) {

        try {

            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);

        }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Error");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }


        // finally is block and will get execute no matter what.
        finally {
            System.out.println("I will be executed anyhow!! :)");
        }


        try {


            FileInputStream f = new FileInputStream("stx.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
//            System.exit(0);
        }

        finally {
            System.out.println("it will execute anyhow");
        }








    }
}
