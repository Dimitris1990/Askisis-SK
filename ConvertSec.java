/*
Write a Java program to convert seconds to hour, minute and seconds.
*/

import java.util.Scanner;

public class ConvertSec{

    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        
        int seconds = user.nextInt();
        int min = seconds / 60;
        int sec = seconds % 60;
        int hrs = min /3600;
        
        System.out.println("Convertion " + hrs + ":" + min + ":" + sec);
    }
}