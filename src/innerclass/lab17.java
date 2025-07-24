package src.innerclass;

public class lab17 {
    public static void main(String[] args) {

        OC o = new OC();
        System.out.println(o.a);



    }
}


class OC{

    int a = 10;



    class InnerClass{
        int b = 10;


        void m1(){
            System.out.println(a);
        }


    }

}




