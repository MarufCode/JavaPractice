package src.innerclass;

public class lab21 {
    public static void main(String[] args) {

        vicky v = new vicky();
        vicky.Ipad vi = v.new Ipad();
        vi.eating();

    }
}




class vicky{

    int age = 11;


    void say(){
        System.out.println("I am eating ");

    }


    class Ipad{

        void eating(){
            System.out.println("I am Ipad");
            System.out.println(age);
        }
    }



}











