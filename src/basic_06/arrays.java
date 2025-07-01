package src.basic_06;

public class arrays {
    public static void main(String[] args) {



        // Arrays -> Collection of data which is similar types
//         {"Maruf", "Mahibhai", "Vicky", "Captain"}

        // Array store homogenous  data


        String[] items = {"milk", "bread", "coke", "butter"};

        System.out.println(items[0]);
        System.out.println(items.length);
        System.out.println(items[2]);
//        System.out.println(items[5]);  // not present -> Exception in thread main



        // Initialization in array

        int[] a = new int[4];
        // a-> [0,0,0,0,] // default value of int is -> 0

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0]= 99;
        System.out.println(a[0]);

        a[0] = 55;
        System.out.println(a[0]);

        a[3]= 45;
        System.out.println(a[3]);

//        System.out.println(a[5]);



        int []arr1 = {1,2,3,4};
        int []arr2 = {1,2,3,4};


        System.out.println(arr1==arr2);

        int[]arr3 = arr1;
        System.out.println(arr3==arr1);

        System.out.println(arr1.equals(arr2));

        // String -> If it is string then answer would be true
        // Array -> In array dont compare the value -> Always check the reference


        arr3[0]= 24;

        System.out.println(arr3[0]);
        System.out.println(arr3[0]);













    }
}
