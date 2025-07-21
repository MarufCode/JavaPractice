package src.OOPS_Concept.Inheritance.MultiLevel;

public class Account_RC {

    public static void main(String[] args) {

        Account a = new Account();
//       a.mainAccountFunction();



        new BankAccount().mainAccountFunction();
        new BankAccount().bankAccountFunction();

        System.out.println();

        new SavingAccount().mainAccountFunction();
        new SavingAccount().bankAccountFunction();
        new SavingAccount().SavingAccountFunction();




    }
}
