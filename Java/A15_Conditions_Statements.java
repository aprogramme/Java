import java.util.Scanner;

public class A15_Conditions_Statements {
    public static void main(String[] args){
        // int age = 52;
        // if(age > 18){
        //     System.out.println("You can drive");
        // }
        // else{
        //     System.out.println("You cannot drive");
        // }

        // -----------RELATIONAL OPERATORS-----------
        // int age = 18;
        // boolean cond = (age == 19);
        // if(cond){
        //     System.out.println("You can drive");
        // }
        // else{
        //     System.out.println("You cannot drive");
        // }

        // -----------LOGICAL OPERATORS-----------
        // 1. AND Operators
      //   System.out.println("For logical AND");
      //    boolean a = true;
      //    boolean b = false;
      //    if(a && b){
      //       System.out.println("Y");
      //    }
      //    else{
      //       System.out.println("N");
      //    }

        // 2. OR Operators
      //   System.out.println("For logical OR");
      //    boolean c = true;
      //    boolean d = false;
      //    if(c || d){
      //       System.out.println("Y");
      //    }
      //    else{
      //       System.out.println("N");
      //    }

        // 3. NOT Operators
      //   System.out.println("For logical NOT");
      //    boolean x = true;
      //    boolean y = false;
      //    System.out.print("NOT(x) is: ");
      //    System.out.println(!x);
      //    System.out.print("NOT(y) is: ");
      //    System.out.println(!y);

      // -----------IF-ELSE LADDER-----------
      // int age;
      // System.out.println("Enter your age");
      // Scanner sc = new Scanner(System.in);
      // age = sc.nextInt();
      // if(age>56){
      //    System.out.println("You are experienced person");
      // }
      // else if(age>46){
      //    System.out.println("You are semi-experienced");
      // }
      // else if(age>36){
      //    System.out.println("You are semi-semi-experienced");
      // }
      // else{
      //    System.out.println("You are not experienced");
      // }

      // -----------SWITCH CASE-----------
      int age;
      System.out.println("Enter your age");
      Scanner sc = new Scanner(System.in);
      age = sc.nextInt();
      switch(age){
         case 18:
         System.out.println("You are going to become an adult");
         break;
         case 23:
         System.out.println("You are going to join company");
         break;
         case 50:
         System.out.println("You become an experienced engineer");
         break;
         case 67:
         System.out.println("You are going to be retired");
         break;
         default:
         System.out.println("Enjoy your life");
      }
      System.out.println("Thanks for using my code!");
    }   
}
