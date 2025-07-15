package src.OOPS_Concept.Constructor;

public class Payment_Mode {

    String Online;

    String Offline;

    Double Cash;

    String Stocks;


    Payment_Mode(){
        System.out.println("default Constructor");
    }

    Payment_Mode(String Online){
        this.Online = Online;
//        this.Offline = Offline;
        System.out.println("Param Constructor");
    }





    void doingPaymentBy(){
        System.out.println(Online);
//        System.out.println(Offline);

    }
}
