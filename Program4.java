/*
Create a program that accepts 2 numbers. You cannot use Scanner class. 
The program will print a message for each relational operator (>, <, >=, <=, ==, !=).
First a message will be printed with the numbers that were entered like below:
Numbers entered : 2, 6.
Each relational operator will have its own message.
For example (Relational operator ==):
    Is 2 equal to 6: true/false.
*/

public class Program4{

       public static void main (String[] args){
           
            int a = 2;
            int b = 6;
            
            System.out.println("Numbers entered: " + a +", " + b);
            System.out.println("Relational operator > " + a + " greater than " + b + ": " + (a>b));
            System.out.println("Relational operator < " + a + " less than " + b + ": " + (a<b));
            System.out.println("Relational operator >= " + a + " greater or equal than " + b + ": " +(a>=b));
            System.out.println("Relational operator <= " + a + " less or equal than " + b + ": " + (a<=b));
            System.out.println("Relational operator == " + a + " equal to " + b + ": " + (a==b));
            System.out.println("Relational operator != " + a + " not equal to " + b + ": " + (a!=b));
       }
}