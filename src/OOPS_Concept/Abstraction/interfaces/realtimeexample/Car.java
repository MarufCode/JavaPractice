package src.OOPS_Concept.Abstraction.interfaces.realtimeexample;

public class Car implements Engine , Break {

    void start(){
        System.out.println("Started the Car");
        startEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Started!! ");
    }

    @Override
    public void Break() {
        System.out.println("Break Mechanism is working fine!!! ");
    }
}
