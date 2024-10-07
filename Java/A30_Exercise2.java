import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

public class A30_Exercise2 {
    public static void main(String[] args){
        // 0 for Rock
        // 1 for Paper 
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissor");
        System.out.println("Enter your number");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Match Draw!");
        }
        else if(userInput == 0 && computerInput == 1){
            System.out.println("Computer Win!");
        }
        else if(userInput == 0 && computerInput == 2){
            System.out.println("You Win!");
        }
        else if(userInput == 1 && computerInput == 0){
            System.out.println("You Win!");
        }
        else if(userInput == 1 && computerInput == 2){
            System.out.println("Computer Win!");
        }
        else if(userInput == 1 && computerInput == 0){
            System.out.println("Computer Win!");
        }
        else if(userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }

        if(computerInput==0){
            System.out.println("Computer Choose: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer Choose: Paper");
        }
        if(computerInput==2){
            System.out.println("Computer Choose: Scissor");
        }
    }
}
