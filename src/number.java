import java.util.Scanner;

public class number {

    public static void main(String[] args){
        /*
        Write a Java program to get a number from the user and print whether it is positive or negative.

Your output should look like this:
Test Data
Enter a number: 35
35 is positive.
         */

    Scanner input= new Scanner(System.in);
        System.out.println("Test Data");
    System.out.println("Please enter a number: ");
       int userInput= input.nextInt();

    if(userInput > 0){
        System.out.println(userInput + " is positive.");
    }
    else{
        System.out.println(userInput + " is negative.");
    }

















    }
}
