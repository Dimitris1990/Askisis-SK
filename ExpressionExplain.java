/*
What is the result of the expression -x + x++ - --x + x; where x = 1. Why? Can you explain?
*/

public class ExpressionExplain{

       public static void main (String[] args){

              int x = 1;
              int i = -x + x++ - --x + x;
              System.out.println("The result is: " + i);
              System.out.println("The sequence of this expression is:");
              System.out.println("For i = -1 + 1 - 1 + 1 ");
              System.out.println("For x = 1 -> x = 2 -> x = 1 -> x = 1");
              System.out.println("When the ++ or -- is on the right side of x then it shanges the value of the x "+
                                 "after it calculates -x + x.");
              System.out.println("So we have -1 + 1 and the x changes value after it.");
              System.out.println("But when the ++ or -- is on the left side of the x then it first changes its value.");

       }
}