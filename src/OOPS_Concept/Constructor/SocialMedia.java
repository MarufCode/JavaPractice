package src.OOPS_Concept.Constructor;

public class SocialMedia {


    String Name;

    int Password;




    SocialMedia(){
        System.out.println("SocialMedia - DC ");
    }



    SocialMedia(String name, int password){
        this.Name = name;
        this.Password = password;
    }



    void printDetails(){
        System.out.println(Name);
        System.out.println(Password);
    }





}
