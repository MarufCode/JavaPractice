package src.OOPS_Concept.Constructor;

public class lab06 {
    public static void main(String[] args) {


        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        System.out.println("--- ---------- ------------- ");

        BankAccount hdfc = new BankAccount("HDFC", "002");
        hdfc.printDetails();


        System.out.println("--- ---------- ------------- ");


        BankAccount icici = new BankAccount("ICICI", "003");
        icici.printDetails();















    }


}
