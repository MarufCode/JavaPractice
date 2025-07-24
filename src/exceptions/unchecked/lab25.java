package src.exceptions.unchecked;

public class lab25 {

    public static void main(String[] args) {

        //Exception:
        //Event occur during the execution of program that disrupts the normal flow of instructions.

        // Checked means compiled time
        // Unchecked means run time

        try {
            String name = null;
            name.trim();
        }catch (Exception e){
            System.out.println("Not possible, You are trying to trim a null string ");
        }

        System.out.println("-- End of program-- ");




    }
}
