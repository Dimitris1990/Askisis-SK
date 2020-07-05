/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/

import java.util.Scanner;

public class AverageNum{

       public static void main (String[] args){

             Scanner user = new Scanner(System.in);
             System.out.println("Give 1st number: ");
             double a = user.nextInt();

             System.out.println("Give 2nd number: ");
             double b = user.nextInt();

             System.out.println("Give 3rd number: ");
             double c = user.nextInt();

             double sum = (a+b+c);

             System.out.println("The average of " + a +", " + b +", " + c + " is: " + (sum/3));

       }
}
