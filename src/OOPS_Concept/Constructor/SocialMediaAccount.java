package src.OOPS_Concept.Constructor;

public class SocialMediaAccount {

    String Name;

    String Username;

    int Password;

    Object Followers;





    SocialMediaAccount(){
        Name = "Maruf";
        Username = "Maruf123";
        Password = 12345;
        System.out.println("DC will always print!!");
    }

    SocialMediaAccount(String name, String username,  int password){
        this.Name = name;
        this.Username = username;
        this.Password = password;
    }





    void print(){
        System.out.println("Name -> " + Name);
        System.out.println("Username -> " + Username);
        System.out.println("Password -> " +  Password);

    }


}
