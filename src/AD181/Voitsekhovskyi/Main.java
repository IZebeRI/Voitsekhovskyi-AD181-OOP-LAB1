package AD181.Voitsekhovskyi;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //arr for letters
        String[] Letters = new String[5];

        //enter symbols to arr
        for (int i = 0; i <= 4; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a letter \n");
            Letters[i] = in.nextLine();

        }

        //check if palindrome
        if (Letters[0].equals(Letters[4])) {
            if (Letters[1].equals(Letters[3])) {
                System.out.print("Your word is palindrome \n");
            } else {
                System.out.print("Your word is not palindrome \n");
            }
        } else {
            System.out.print("Your word is not palindrome \n");
        }
    }
}