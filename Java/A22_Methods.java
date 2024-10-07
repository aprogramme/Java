public class A22_Methods {
    // Methods
    static int mySum(int x, int y){
        int z;
        z = x + y;
        return z;
    }
    public static void main(String[] args){
        int a = 67;
        int b = 33;
        int c;
        
        /*
        // Method invocation using Object creation
        Methods_22 obj = new Methods_22();
        c = obj.mySum(a, b);
        */

        c = mySum(a, b);
        System.out.println(c);
    }
}
