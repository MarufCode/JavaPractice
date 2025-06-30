package src.interview_programs;

public class even_odd_number {
    public static void main(String[] args) {


        // Find the even and odd numbers from  to 100

        for (int i = 0; i<=100; i++){
            if (i%2==1){
                System.out.println(i + "Number is odd");
            }else
                System.out.println(i+ "Number is even");
        }
    }
}
