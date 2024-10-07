public class A9_Associativity {
    public static void main(String[] args){
        // Precedence & Associativity
        int a = 6*5-45/5;
        /*
           6*5-45/5
           30 - 9
           21
         */
        System.out.println("a: " + a);

        int b = 60/5-45*5; 
        /*
           60/5-45*5
           12 - 225
           -213
         */  
        System.out.println("b: " + b); 

        int c = 60*5-45/5; 
        /*
           60*5-45/5
           300 - 9
           291
         */
        System.out.println("c: " + c);
    }
}
