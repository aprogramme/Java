import java.util.Scanner;

// public class A58_NestedTryCatch {
//     public static void main(String[] args){
//         int [] marks = new int[3];
//         marks[0] = 78;
//         marks[1] = 98;
//         marks[2] = 88;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of index");
//         int ind = sc.nextInt();
//         try{
//             System.out.println("Welcome to nested try catch");
//             try{
//                 System.out.println(marks[ind]);
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("Sorry, this index does not exist");
//                 System.out.println("Exception in level 2");
//             }
//         }
//         catch(Exception e){
//             System.out.println("Exception in level 1");
//         }
//     }
// }

// Quick Quiz: Write a java program that allow you to keep accessing an array until a valid index is given by user
public class A58_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 98;
        marks[2] = 88;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to nested try catch");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry, this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}