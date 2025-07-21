package src.OOPS_Concept.Poly.Overriding;

public class RC {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();


        Dog f = new Hound();
        f.bark();




    }
}
