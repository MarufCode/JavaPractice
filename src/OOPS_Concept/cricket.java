package src.OOPS_Concept;

public class cricket {

    // Attributes
    String Bats;

    String Stumps;

    String Gloves;

    long Score;

    String Umpires;






    // Methods or Behaviour

    void isOut(){
        System.out.println("Yes it is out");
    }

    void DRS(){
        System.out.println("Decision Pending");
    }

    void isDeclared(){
        if (Score>=500) {
            System.out.println("Yes, it is declared");
        }else{
            System.out.println("Not Declared!!");
        }
    }

    Boolean isRaining(){
        return true;
    }





}
