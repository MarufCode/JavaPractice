package src.CollectionFramework.Generics;

public class lab38 {
    public static void main(String[] args) {

        temp("Maruf");
//        temp(123); -> Not Possible with non generics
        temp(123);

//        Integer result = max(4,5);
//        System.out.println(result);


         printFun(4, 5);

    }

//    public static void temp(String x){
    public static <Generics> void temp(Generics x){
        System.out.println(x);
    }

//    public static Integer max (Integer a, Integer b){
//        if (a > b)
//            return a;
//        else
//            return b;
//    }


    public static <T> void printFun (T a, T b){
        System.out.println(a);
        System.out.println(b                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 );
    }
}


