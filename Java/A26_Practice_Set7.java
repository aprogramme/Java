
public class A26_Practice_Set7 {
    // Q.No.1
    /*
     static void multiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.format("%d * %d = %d\n", n, i, n*i);
        }
     }
     public static void main(String[] args){
        multiplication(9);
     }
     */

    //  Q.No.2
    /*
    static void patter(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        patter(5);
    }
    */

    // Q.No.3 : Resursive method
    /*
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(sum(8));
    }
    */

    // Q.No.4;
    /*
    static void patter(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        patter(5);
    }
    */

    // Q.No.5 : fibonacci series: 0 1 1 2 3 5 8 13 21 34 55...
    /* 
    static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        int result = fibonacci(7);
        System.out.println(result);
    }
    */

    // Q.No.6
    /* 
    static float Average(int ...arr){
        float sum = 0;
        float result = 0;
        for(int x:arr){
            sum += x; 
            result = (sum)/(arr.length);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("The average of nothing is: " + Average());
        System.out.println("The average of 1 and 2 is: " + Average(1, 2));
        System.out.println("The average of 1, 2 and 3 is: " + Average(1, 2, 3));
        System.out.println("The average of 1, 2, 3 and 4 is: " + Average(1, 2, 3, 4));
        System.out.println("The average of 1, 2, 3, 4 and 5 is: " + Average(1, 2, 3, 4, 5));
    }
    */

    // Q.No.7

    // Q.No.8
    /* 
    static void pattern_recursive(int n){
        if(n > 0){
            pattern_recursive(n-1);
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_recursive(6);
    }
    */

    // Q.No.9
    static int sum_iterative(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("The sum is: " + sum_iterative(8));
    }

} 
