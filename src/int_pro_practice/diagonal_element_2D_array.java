package src.int_pro_practice;

public class diagonal_element_2D_array {
    public static void main(String[] args) {

        // Diagonal
//        |1,2,3|
//        |4,5,6|
//        |7,8,9|


        int[][] array_2D = new int  [3][3];

        array_2D[0][0] = 1;
        array_2D[0][1] = 7;
        array_2D[0][2] = 7;
        array_2D[1][0] = 7;
        array_2D[1][1] = 9;
        array_2D[1][2] = 7;
        array_2D[2][0] = 7;
        array_2D[2][1] = 7;
        array_2D[02][2] = 17;



        for (int i = 0; i<array_2D.length; i++){
            System.out.println(array_2D[i][i]);
        }







    }
}
