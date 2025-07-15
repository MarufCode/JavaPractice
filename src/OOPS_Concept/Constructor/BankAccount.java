package src.OOPS_Concept.Constructor;

public class BankAccount {

    String bankName;

    int balance;

    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "001";
        System.out.println("Default C");
    }


    BankAccount(String bName, String bCode){
        this.bankName = bName;
        this.bankCode = bCode;
        System.out.println("Param C");
    }


    void printDetails(){
        System.out.println("bankName -> " + bankName);
        System.out.println("balance -> " + balance);
        System.out.println("bankCode -> "+ bankCode);
    }

}
