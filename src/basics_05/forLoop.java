package src.basics_05;

public class forLoop {
    public static void main(String[] args) {

    // Common thing need to remember

       //  for (A,B,C)
        // A-> Initialization - It is starting point
        // B-> When you want this to stop.
        // c-> how you want to do increment or decrement
        // D-> Which code you want to execute - SOP statement



        // if you start with 0 condition should be i<10 because indexing start with zero
        // if u start with 1 then it should be i<=10 to print 10 times

//        for (int i =0; i<10; i++){
//            System.out.println("Print this");
//        }

//        for (int i =1; i<=10; i++){
//            System.out.println("Print this");
//        }

        // Infinite loop
//        for (; ; ){
//            System.out.println("Maruf");
//        }

        // Exit code -> 0 : Normal and program finished
        // Exit code -> 1 : force exit
        // Exit code -> 0 : Human interrupted

//        for (float i = 1; i<45.2; i++) {
//            System.out.println("Float value checking");
//        }


//        for (double i = 1; i<45.2; i++) {
//            System.out.println("double char type value checking");
//        }


//        for (int i = 0; i>1; i++){
//            System.out.println("Maruf");
//        }
        System.out.println("End"); // -> this will always execute



        // Print the value if i and break when i = 5

        for (int i =1; i<=10; i++){
            // System.out.println("Value of i is " + i); -> first it will the value and then check the condition
            if (i==5){
                break;
            }
            System.out.println("Value of i is " + i);
        }
        System.out.println("End");




        // Decrement

        for (int i = 10; i>0; i--){
            System.out.println("value of i is " + i);
        }




    }
}
