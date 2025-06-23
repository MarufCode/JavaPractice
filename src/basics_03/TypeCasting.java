package src.basics_03;

public class TypeCasting {
    public static void main(String[] args) {


        // Casting - Mold

        byte b = 10;

//        int a = b;  // Implicit Casting
        int a = (int) b ; // Explicit Casting





        int a1 = 300;

        byte b1 = (byte) a1;
        System.out.println(b1);

        int course = 100;

        float GST = 0.1845f;

        float total = course+GST*course;
        System.out.println(total);


























    }
}
