import java.util.Scanner;

public class A12_Strings {
    public static void main(String[] args){
        // String name = new String("Aayush");
        // String name = "Aayush";
        // System.out.print("The name is: "); // Print(): No new line at the end!
        // System.out.println("The name is: "); // Println(): New line at the end!
        // System.out.print(name);

        int a = 8;
        float b = 5.67548f;
        System.out.printf("The value of a is %d and b is %f\n", a, b); // Just like C language
        System.out.printf("The value of a is %d and b is %.2f\n", a, b); // Just like C language
        System.out.printf("The value of a is %d and b is %8.2f\n", a, b); // Just like C language
        // System.out.format("The value of a is %d and b is %f", a, b);

        Scanner sc = new Scanner(System.in);
        // String st = sc.next();  // next() will only print first word
        String st = sc.nextLine();  // nextLine() will print full sentence
        System.out.println(st);
    }
}
