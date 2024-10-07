public class A56_Try_Catch {
    public static void main(String[] args){
        int a = 6000;
        int b = 0;

        // without try 
        // int c = a/b;
        // System.out.println("The result is " + c);

        // with try 
        try{
            int d = a/b;
            System.out.println("The result is: " + d);
        }
        catch(Exception e){
            System.out.println("We failed to divide.\nReason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}