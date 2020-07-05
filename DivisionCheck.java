/*
Check if a number can be divided by 3. Input the number by using the args array of the main method.
*/

public class DivisionCheck{

       public static void main (String[] args){

            byte i = Byte.parseByte(args[0]);
            

            if(i % 3==0){
              System.out.println("The number is divided");

              }else{
                   System.out.println("the number is not divided");
              }

       }
}