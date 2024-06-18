package wee.dev;

import java.util.Scanner;

import static wee.dev.ALPHABET.textToAscii26x13;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to convert to ASCII art (write 999 to leave):");

        while(true) {
            String text = scanner.nextLine();
            System.out.println(textToAscii26x13(text));
            if(text.equals("999")) {
                break;
            }
        }
        System.out.println("Goodbye!");

    }

}