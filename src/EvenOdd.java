import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {


        System.out.println("Enter the first number: "); //output asking for the users first number
        int numberA = 12; //This would normally be asking the use to input the first number for this program
        System.out.println("Your number is " + numberA);

        if(numberA%2==0) //even number divid by 2 returns 0 reminder}
            System.out.println(numberA + " is even. ");
        else
        System.out.println(numberA + " Odd number. ");



    }
}