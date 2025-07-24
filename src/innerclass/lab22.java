package src.innerclass;

public class lab22 {
    public static void main(String[] args) {

        parent p = new parent();  // Upcasting

        child c = new child();
        c.print();
        p = c;
//        c = p;  -> Not Possible
    }
}







// Upcasting and DownCasting in class


class parent{}

class child extends parent{
    void print(){
        System.out.println("Hiii");
    }
}



















