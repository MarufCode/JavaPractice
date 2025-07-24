package src.innerclass;

public class lab19 {
    public static void main(String[] args) {


        OuterClass OC = new OuterClass();

        OuterClass.nestedInner NI = new OuterClass.nestedInner();
        NI.show();
    }
}








class OuterClass{
    static int a = 10;

    int b = 20;


    static class nestedInner{


        void show(){
            System.out.println(a);
        }



    }


}

