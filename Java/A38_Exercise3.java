import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfguesses;

    public int getNoOfGuesses(){
        return noOfguesses;
    }
    public void setNoOfGuesses(int noOfguesses){
        this.noOfguesses = noOfguesses;
    }
      
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        if(inputNumber == number){
            return true;
        }
        else if(inputNumber>number){
            System.out.println("Low number");
        }
        else if(inputNumber<number){
            System.out.println("High number");
        }
        return false;
    }
}
 
public class A38_Exercise3 {
    public static void main(String[] args){
        Game g = new Game();
        boolean b = false;
        while(!b){
        g.takeUserInput(); 
        b = g.isCorrectNumber();
        System.out.println(b);
        }
    }
}
