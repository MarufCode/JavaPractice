package src.OOPS_Concept.Abstraction.interfaces;

public class maruf implements fatherI{

    @Override
    public void loan1k() {
        print();
       fatherI.print2();
        System.out.println("I will pay loan");
    }
}
