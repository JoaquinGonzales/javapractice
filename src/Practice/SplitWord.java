package Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a phrase to split");
        String stringToSplit = scanner.nextLine();

        String [] arr = stringToSplit.split(" ");
        String res="";

        for (String ss: arr)
        {
            System.out.println("test"+ ss.length());
            if (ss.length() >1)
            {
                for (int i = (ss.length() -1); i == 0; i--)
                {
                    System.out.println("char"+ ss.charAt(i));
                }

            }

        }


    }
}
