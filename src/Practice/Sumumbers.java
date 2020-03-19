package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumumbers {
    public static void main(String[] args) {
        System.out.println("insert first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("insert second number");
        int secondNumber = scanner.nextInt();

        int counter = 0;
        ArrayList arr = new ArrayList();
        arr.add(firstNumber);

        for (int i = firstNumber; i < secondNumber; i++)
        {
            arr.add(i+1);
        }
        for (int j=0 ; j < arr.size(); j++)
        {
            counter = counter + (int)arr.get(j);
        }

        System.out.println("this is the sum " + counter);

    }
}
