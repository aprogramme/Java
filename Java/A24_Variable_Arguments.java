public class A24_Variable_Arguments {
    /*
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */
    static int sum(int ...arr){
    //    Availabe as  int [] arr;
    int result = 0;
         for(int a: arr){
             result += a;
         }
    return result;
    }

    static int product(int ...x){
        int result = 1;
        for(int y:x){
            result *= y;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Welcome to Varargs");
        System.out.println("Sum of nothing is: " + sum());
        System.out.println("The sum of 5 and 9 is: " + sum(5, 9));
        System.out.println("The sum of 5, 7 and 9 is: " + sum(5, 7, 9));
        System.out.println("The sum of 5, 7, 4 and 9 is: " + sum(5, 7, 4, 9));

        System.out.println("product of nothing is: " + product());
        System.out.println("The product of 5 and 9 is: " + product(5, 9));
        System.out.println("The product of 5, 7 and 9 is: " + product(5, 7, 9));
        System.out.println("The product of 5, 7, 4 and 9 is: " + product(5, 7, 4, 9));
    }
}
