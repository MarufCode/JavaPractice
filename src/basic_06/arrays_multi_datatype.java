package src.basic_06;

public class arrays_multi_datatype {
    public static void main(String[] args) {



        int int_array[] = {1,1,2,3,4};
        float f_array[] = {45.2f,52.3f, 62.1f};
        double d_array [] = {12.3, 22.3, 33.21, 10.2};

        String names_array[] = {"MAruf", "Vicky", "Nasir"};
        char char_array [] = {'c', 'a' };
        boolean b_array [] = {true, false};

        System.out.println(int_array.length);
        System.out.println(names_array.length);


        for (int i = 0; i < names_array.length; i++) {
            System.out.println(names_array[i]);

        }

        for (int j = 1; j<= int_array.length; j++){
            if (j%2==0){
                System.out.println(j +" is EVEN");
            }else {
                System.out.println(j + " is ODD");
            }
        }


    }
}
