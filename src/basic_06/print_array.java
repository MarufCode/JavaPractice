package src.basic_06;

public class print_array {
    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5};

        System.out.println(arr.length);

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // If we kept <= use with length-1

        for (int i = 0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }


        // Double the following array
        int arr2 [] = {10, 20, 30, 40, 50};

        System.out.println(arr2.length);

        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]*2);

        }


    }
}
