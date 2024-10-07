public class A21_Practice_Set6 {
    public static void main(String[] args){
        // ------------------Q.No.1------------------
        /* 
        float [] marks = {56.7f, 45.4f, 69.98f, 23.66f, 99.34f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
        */

        // ------------------Q.No.2------------------
        /* 
         float [] marks = {56.7f, 45.4f, 69.98f, 23.66f, 99.34f};
        float num = 56.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
        System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
        */

        // ------------------Q.No.3------------------
        /* 
         float [] marks = {56.7f, 45.4f, 69.98f, 23.66f, 99.34f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average is " + sum/marks.length);
        */

        // ------------------Q.No.4------------------
        /*
        int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] mat2 = {{7, 8, 9}, {2, 4, 1}}; 
        int [][] result = {{0, 0, 0}, {0, 0, 0}}; 

        for(int i = 0; i<mat1.length; i++){  // row number of times
            for(int j = 0; j<mat1[i].length; j++){  // column number of times
                System.out.format("Setting value for i = %d and j = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            } 
        }
        // Printing the element of 2D Array 
        for(int i = 0; i<mat1.length; i++){  // row number of times
            for(int j = 0; j<mat1[i].length; j++){  // column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); //printing new line
        }
        */

        // ------------------Q.No.5------------------
        /*
        int [] marks = {23, 45, 67, 69, 98, 72};
        for(int i = marks.length-1; i >= 0; i--){
            System.out.println(marks[i] + " ");
        }
        */
        // OR
        /*
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l, 2);
        for(int i = 0; i < n; i++){
            // Swap arr[i] and arr[l-i-1]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
        */

        // ------------------Q.No.6------------------
        //  int [] arr = {71, 22, 33, 409, 45, 69};
         int [] arr = {1, 2, 3, 4, 5, 6};
         boolean isSorted = true;
         for(int i = 0; i < arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isSorted = false;
                break;
            }
         }
         if(isSorted){
            System.out.println("The array is sorted");
         }
         else{
           System.out.println("The array is not sorted");

         }

    }

}
