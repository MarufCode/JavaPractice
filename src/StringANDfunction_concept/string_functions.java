package src.StringANDfunction_concept;

public class string_functions {
    public static void main(String[] args) {


        String name = "Maruf";
        System.out.println(name.concat(" Sherikar"));
        System.out.println(name);

        System.out.println(name.contains("a"));

        String name2 = new String("MahiBhai");

        String expected_result = "password@123";
        String actauL_result = "Password@123";

        if (expected_result.equalsIgnoreCase(actauL_result)){
            System.out.println("Yes it will print");
        }


        // == check for reference
        // equals method check the content

        String s1 = "Maruf";
        String s2 = "maruf";
        String s3 = new String("Maruf");
        String s4 = new String("Mruf");

        System.out.println(s1==s2);
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1==s3);
        System.out.println(s3==s4);








    }
}
