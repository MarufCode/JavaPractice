package src.OOPS_Concept.Constructor;

public class lab07 {
    public static void main(String[] args) {


        Payment_Mode pm = new Payment_Mode();
        pm.doingPaymentBy();

        System.out.println("___  ____  ____________ ___________");

        Payment_Mode pm2 = new Payment_Mode("PhonePay");
        pm2.doingPaymentBy();



    }
}
