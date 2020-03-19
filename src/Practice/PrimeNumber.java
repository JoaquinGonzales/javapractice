package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();



        if (num > 1)
        {
            int counter = 0;
            for (int i = 1; i <= num; i++)
            {
                if(num%i == 0)
                {
                    counter++;
                }
            }
            if(counter <= 2) {System.out.println(true);}
            else System.out.println(false);
        }
        else
            System.out.println(false);


//        if (number > 1)
//        {
//            for (int i = 1; i <= number; i++)
//            {
//                if(number%i == 0)
//                {
//                    counter++;
//                }
//            }
//            if (counter >2)
//            {
//                System.out.println("The number "+number + " is Composed number");
//            }
//            else
//                System.out.println("The number "+ number + " is Prime Number");
//
//        }
//        else
//        {
//            System.out.println("number must be grater than 1");
//        }
    }
}
