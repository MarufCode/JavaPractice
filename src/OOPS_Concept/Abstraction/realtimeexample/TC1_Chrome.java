package src.OOPS_Concept.Abstraction.realtimeexample;

public class TC1_Chrome extends BaseClass{

    @Override
    String openBrowser() {
        System.out.println("Starting Chrome! ");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Chrome! ");
        return null;
    }
}
