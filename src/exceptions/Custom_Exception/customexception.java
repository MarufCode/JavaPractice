package src.exceptions.Custom_Exception;

public class customexception extends Exception{

    public customexception(String msg){
        super(msg);
        System.out.println("if i got this, this is a Custom Exception");
    }


}
