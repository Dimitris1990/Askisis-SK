/*
Create a program that calculates the annual salary. Monthly salary is 900$. 
Government taxes you 9%. How much do you / government get each year?
Store the result in the most effective data type.
*/


public class AnnualSalary{

       public static void main (String[] args){

            float mSal = 900.0f;
            float ySal = mSal * 12;
            float tax = (9.0f / 100.0f) * ySal;
            System.out.println("Annual Salary: " + ySal);
            System.out.println("Taxes: " + tax);
            System.out.println("You are left with " + (ySal - tax) + " after taxation.");
       }

}