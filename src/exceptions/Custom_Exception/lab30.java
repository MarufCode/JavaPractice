package src.exceptions.Custom_Exception;

public class lab30 {
    public static void main(String[] args) throws customexception {


        Bank jpchase = new Bank("USD", 100);

        Bank hdfc = new Bank("INR", 100);
        Bank icici = new Bank("INR", 100);

        System.out.println(hdfc.add(jpchase));
//        System.out.println(hdfc.add(icici));




















    }
}
