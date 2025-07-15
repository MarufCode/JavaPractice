package src.OOPS_Concept.Constructor;

public class lab08 {
    public static void main(String[] args) {



        SocialMediaAccount sma = new SocialMediaAccount();
        sma.print();


        System.out.println("________________________________");


        SocialMediaAccount sma2 = new SocialMediaAccount("Maruf", "Maruf@123" , 12345);
        sma2.print();



        System.out.println("________________________________");



        SocialMediaAccount sma3 = new SocialMediaAccount("MahiBhai", "Mahi@7", 45678);
        sma3.print();
    }
}
