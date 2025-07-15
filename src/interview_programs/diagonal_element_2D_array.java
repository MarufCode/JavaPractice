package src.interview_programs;

public class diagonal_element_2D_array {
    public static void main(String[] args) {

        // Diagonal
//        |1,2,3|
//        |4,5,6|
//        |7,8,9|

        int[][]array_2D = new int[3][3];

        array_2D[0][0]= 1;
        array_2D[0][1]= 2;
        array_2D[0][2]= 3;
        array_2D[1][0]= 4;
        array_2D[1][1]= 5;
        array_2D[1][2]= 6;
        array_2D[2][0]= 7;
        array_2D[2][1]= 8;
        array_2D[2][2]= 9;

        for (int i = 0; i <array_2D.length ; i++) {
            System.out.println(array_2D[i][i]);

        }


        for (int j = 0; j <array_2D.length ; j++) {
        System.out.println(array_2D[j][array_2D.length - 1 - j]);

        }


        int [][] array2D = new int[3][3];


        array_2D [0][0] = 100;
        array_2D [0][1] = 2;
        array_2D [0][2] = 3;
        array_2D [1][0] = 4;
        array_2D [1][1] = 500;
        array_2D [1][2] = 6;
        array_2D [2][0] = 7;
        array_2D [2][1] = 7;
        array_2D [2][2] = 700;


        for (int i = 0; i <array2D.length ; i++) {
            System.out.println(array2D[i][i]);

        }














    }
}
