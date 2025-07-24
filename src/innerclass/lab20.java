package src.innerclass;

public class lab20 {
    public static void main(String[] args) {

        maruf m = new maruf("Watto");
        maruf.inner mi = new maruf.inner();
        mi.cricket();




    }
}




class maruf{

     String name;
     static int exp = 20;

    maruf(String name) {
        System.out.println("My name is " + name);

    }

          static class inner{

            void cricket(){
                System.out.println(exp);
            }




        }







}
