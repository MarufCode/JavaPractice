package src.OOPS_Concept.Constructor;

public class SocialMediaMain {

    public static void main(String[] args) {

//
//        SocialMedia sm = new SocialMedia();
//        sm.printDetails();

        SocialMedia sm2 = new SocialMedia("Instagram", 123);
        sm2.printDetails();

        SocialMedia sm3 = new SocialMedia("FaceBook", 456);
        sm3.printDetails();
    }
}
