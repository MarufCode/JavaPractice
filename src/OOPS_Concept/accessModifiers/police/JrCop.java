package src.OOPS_Concept.accessModifiers.police;

public class JrCop {

    public static void main(String[] args) {


        cop c1 = new cop(2);
        System.out.println(c1.gun);
        c1.canIShoot();
    }
}

