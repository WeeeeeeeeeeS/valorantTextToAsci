package wee.dev;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        FileReader reader = new FileReader("chars.json");

        Map<String, String[][]> asciiArtMap = gson.fromJson(reader, new TypeToken<Map<String, String[][]>>(){}.getType());
        reader.close();

        ValorantTextToAscii valorantTextToAscii = new ValorantTextToAscii(asciiArtMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to convert to ASCII art (write 999 to leave):");

        while(true) {
            System.out.print("Text: ");
            String text = scanner.nextLine();
            System.out.println(valorantTextToAscii.textToAscii26x13(text));
            if(text.equals("999")) {
                break;
            }
        }
        System.out.println("Goodbye!");

    }

}