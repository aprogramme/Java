class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";  
    }
}

public class A60_Throw {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeArraySizeException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        // Made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args){
        // aayush - uses divide function created by harry
        try{
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}