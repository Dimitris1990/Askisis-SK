/*
Explore Math class. Input a double number like 3.45. What is the result of ceil, floor, round, abs of Math class?
What are the results of the above if number = -3.45?
*/

public class MathClass{

    public static void main(String[] args){
        
              double a = Math.ceil(3.45);
              double b = Math.ceil(-3.45);

              System.out.println("Ceil a: " + a + " Ceil b: " + b + " Strogkilopoiisi panw");
        
              a = Math.floor(3.45);
              b = Math.floor(-3.45);
              
              System.out.println("Floor a: " + a + " Floor b: " + b + " Strogkilopoiisi katw");
              
              a = Math.round(3.45);
              b = Math.round(-3.45);
              
              System.out.println("Round a: " + a + " Round b: " + b + " Strogkilopoiisi kanoniki");
              
              a = Math.abs(3.45);
              b = Math.abs(-3.45);
              
              System.out.println("Abs a: " + a + " Abs b: " + b + " Apoliti timi xwris prosima...Epistrefei thetika");
    }
}
