package src.staticKeyword;

public class staticDemo {

    // Static variables
    public static String college_name = "NMIMS";


    // Non static Variables
    public int version = 10;


    public static void printName(){
        System.out.println("College name is -> "  + college_name);
//        System.out.println("version is -> " + version); // Not possible because it is not static in nature
        // Cant have instance variable in static method

    }


    public void printVersion(){
        System.out.println("version is -> " + version);
        System.out.println("College name is -> "  + college_name);
    }

}
