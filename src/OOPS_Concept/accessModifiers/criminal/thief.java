package src.OOPS_Concept.accessModifiers.criminal;

import src.OOPS_Concept.accessModifiers.police.cop;

public class thief {
    public static void main(String[] args) {

        cop c = new cop(10);
        System.out.println(c.gun);
//        c.canIShoot(); because he is not in protected police folder


    }
}
