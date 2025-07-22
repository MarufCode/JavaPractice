package src.OOPS_Concept.Abstraction.realtimeexample;

public class TC1_Edge extends BaseClass{

    @Override
    String openBrowser() {
        System.out.println("Starting Edge! ");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Edge! ");
        return null;
    }
}
