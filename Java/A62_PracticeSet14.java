import java.util.Scanner;

public class A62_PracticeSet14 {
    public static void main(String[] args) {
        // Problem 1
        // int a = 7 --> Syntex error

        // int age = 78;
        // int year_born = 2000-78  --> logical error

        // System.out.println(6/0);  --> Exception error

        // Problem 2
        /*
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("haha");
        }
        catch(ArithmeticException e){
            System.out.println("hehe");
        }
         */

        //  Problem 3
        /*
        boolean flag = true;
        int [] marks = new int [3];
        marks[0] = 78;
        marks[1] = 89;
        marks[2] = 49;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
         */
    }
}
