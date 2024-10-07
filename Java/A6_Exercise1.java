// -----------------------CGPA CALCULATOR----------------------------------

// Write a program to calculate percentage of a given marks. 
// Marks in 5 subject.
// Marks are out of 100

import java.util.Scanner;

public class A6_Exercise1 {
    public static void main(String[] args){
        float total_Marks = 500;
        System.out.println("Enter marks of each subjects");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter marks obtain in Science");
        float Marks1 = S.nextFloat();
        System.out.println("Enter marks obtain in Maths");
        float Marks2 = S.nextFloat();
        System.out.println("Enter marks obtain in Social Science");
        float Marks3 = S.nextFloat();
        System.out.println("Enter marks obtain in English");
        float Marks4 = S.nextFloat();
        System.out.println("Enter marks obtain in Hindi");
        float Marks5 = S.nextFloat();
        float percentage = ((Marks1 + Marks2 + Marks3 + Marks4 + Marks5)/total_Marks)*100;
        System.out.printf("%nYour Percentage is %.2f%n",percentage);
    }
}
