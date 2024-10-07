public class A8_Operators {
    public static void main(String[] args){
        // -----------Artithmetic Operator----------- 
        int a = 4;
        // int b = 6 + a;
        // int b = 6 - a;
        // int b = 6 * a;
        // int b = 6 / a;
        int b = 6 % a; // Modulo Operator
        System.out.println(b);

        // -----------Assignment Operator----------- 
         int c = 9;
        //  c += 3;  // c = c + 3
        //  c -= 3; // c = c - 3
        System.out.println(c);

        // System.out.println(6 == 8); // Comparison operator
        System.out.println(6 == 6); // Comparison operator

        // -----------Logical Operator----------- 
        // System.out.println(64>5 && 78<34);
        System.out.println(64>5 || 78<34);

        // -----------bitwise Operator----------- 
        System.out.println(2&3);
    }
}
