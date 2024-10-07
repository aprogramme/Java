public class A25_Recursion {
    // factorial(0) or factorial(1) = 1
    // factorial(n) = n * n-1 *...1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial_recursive(int n){
         if(n==0 || n==1){
            return 1;
         }
         else{
            return n * factorial_recursive(n-1);
         }
    }

    static int factorial_iterative(int n){
         if(n==0 || n==1){
            return 1;
         }
         else{
            int product = 1;
            for(int i = 1; i <= n; i++){
                product *= i;
            }
            return product;
         }
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("The factorial of " + n + " using recursive is: " + factorial_recursive(n));
        System.out.println("The factorial of " + n + " using iterative is: " + factorial_iterative(n));
    }
}
