package src.OOPS_Concept.Abstraction.interfaces.realtimeexample;

public class Father implements Son, Daughter {

    void CR2(){
        System.out.println(" Father has 2 CR ");
    }


    @Override
    public void nothing() {
        System.out.println("Son has nothing and very lazy");
    }

    @Override
    public void intelligent() {
        System.out.println("She is very Intelligent");
    }
}
