package src.OOPS_Concept.Encapsulation;

public class lab16 {
    public static void main(String[] args) {


        ICICIBank i = new ICICIBank("Maruf" , 100);
        i.setBal(10);
        i.setName("Watto");
        System.out.println(i.bal);

    }
}
