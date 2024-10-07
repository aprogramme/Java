import java.util.Scanner;

public class A7_Practice_Set1 {
    public static void main(String[] args){
        // -----------Q.No. 1-----------
        // 1. Write a program to sum three number.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number1");
        // int a = sc.nextInt();
        // System.out.println("Enter number2");
        // int b = sc.nextInt();
        // System.out.println("Enter number3");
        // int c = sc.nextInt();
        // int sum = a + b + c;
        // System.out.println("The sum of three number is: " + sum);

        // -----------Q.No. 2-----------
        // 2. Write a program to calculate CGPA using marks of three subjects.
        // Scanner m = new Scanner (System.in);
        // System.out.println("Enter marks of subject1");
        // float a = m.nextFloat();
        // System.out.println("Enter marks of subject2");
        // float b = m.nextFloat();
        // System.out.println("Enter marks of subject3");
        // float c = m.nextFloat();
        // float cgpa = (a + b + c)/30;
        // System.out.println(cgpa);

        // -----------Q.No. 3----------- 
        // 3. Write a program which ask the user to enter his/her name and greets them with "Hello <name>, have a good day".
        // System.out.println("Enter you name");
        // Scanner n = new Scanner (System.in);
        // String name = n.next();
        // System.out.println("Hello " + name + " have a good day");

        // -----------Q.No. 4-----------
        // 4. Write a program to convert kilomiles to miles
        // Scanner k = new Scanner (System.in);
        // System.out.println("Enter kilomiles");
        // float km = k.nextFloat();
        // double miles = km * 0.621371;
        // System.out.println("Miles: " + miles);

        // -----------Q.No. 5-----------
        // 5. Write a program to detect whether a number entered by the user is integer or not 
        Scanner i = new Scanner (System.in);
        System.out.println("Enter your number");
        boolean b = i.hasNextInt();
        System.out.println(b);
    }
}
