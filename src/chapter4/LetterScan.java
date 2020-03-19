package chapter4;

import java.util.Scanner;

public class LetterScan {
    public static void main(String[] args) {
        System.out.println("Enter an String");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean letterFound = false;
        scanner.close();
        for (int i = 0; i< text.length(); i++)
        {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'A')
            {
                letterFound = true;
                break;
            }
        }
        if (letterFound)
        {
            System.out.println("The text contains the letter A");
        }
        else
            System.out.println("the text doesn't contains the letter A");
    }
}
