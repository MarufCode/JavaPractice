package src.basics_03;

public class functionofstring {
    public static void main(String[] args) {


        String name = "Mahi Bhai";
        String name1 = "Mahi Bhai";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println();


        String name2 = new String("Mahi bhai");  // OA or Heap Area
//
//        System.out.println(name==name1);
//        System.out.println(name.equals(name1));

//        System.out.println(name==name2);

        System.out.println(name.equalsIgnoreCase(name2));




        // Interview Question

        String s1 = "Hello";
        String s2 = "Guys";
        String s3 = "Hello Guys";

        String s4 = s1.concat(s2);











    }
}
