package src.basic_06;

public class array_2D {
    public static void main(String[] args) {

        // 2D Array ->

        int[]a = {1,2,3};

        int[][] arr = new int[3][3];

        arr[0][0] = 57;
        arr[0][1] = 88;
        arr[0][2] = 78;

        arr[1][0] = 41;
        arr[1][1] = 89;
        arr[1][2] = 85;


        arr[2][0] = 45;
        arr[2][1] = 56;
        arr[2][2] = 23;


        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ "\t");

            }
            System.out.println("");

        }





        int b [] = {10,0};

        int[][] arr2 = new int[10][10];


        arr2[0][0] = 20;
        arr2[0][1] = 20;
        arr2[0][2] = 20;
        arr2[0][3] = 20;
        arr2[0][4] = 20;
        arr2[0][5] = 20;
        arr2[0][6] = 20;
        arr2[0][7] = 20;
        arr2[0][8] = 20;
        arr2[0][9] = 20;



        for (int i = 0; i <b.length; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                System.out.print(arr2[i][j]+"\t");

            }
            System.out.println("");

        }

























    }
}
