import java.util.Scanner;

public class MyFirstJava {
    public static void main(String args[]) {
        System.out.println("Welcome to my world!");
        System.out.println("My name is Shiferaw");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is " + userResponse);

        int firstNo, secondNo, sum;
        System.out.println("Enter firstNo:");
        firstNo = keyboard.nextInt();

        System.out.println("Enter secondNo:");
        secondNo = keyboard.nextInt();

        sum = firstNo + secondNo;

        System.out.println("Sum of " + firstNo + " and " + secondNo + "is " + sum);





    }
}
