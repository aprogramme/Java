import java.util.Scanner;

public class A5_Getting_Input_from_user {
    public static void main(String[] args) { 
        System.out.println("Taking input From the User");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // //int a = sc.nextInt(); // used to take input from keyboard
        // float a = sc.nextFloat();
        // System.out.println("Enter number 2");
        // // int b = sc.nextInt();
        // float b = sc.nextFloat();
        // // int sum = a + b;
        // float sum = a + b;
        // // System.out.println("The sum of these number is " + sum);
        // System.out.println("The sum of these number is");
        // System.out.println(sum);
        
        // boolean b1 = sc.hasNextInt(); // check input number is integer or not, return true for integer
        // System.out.println(b1);

        // String str = sc.next(); // return only first word
        String str = sc.nextLine(); // used to return full sentence
        System.out.println(str);
    }
}
