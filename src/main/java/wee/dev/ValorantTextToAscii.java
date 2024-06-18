package wee.dev;

import java.util.ArrayList;
import java.util.Map;

public class ValorantTextToAscii {
    final Map<String, String[][]> asciiArtMap;
    public ValorantTextToAscii(Map<String, String[][]> asciiArtMap) {
        this.asciiArtMap = asciiArtMap;
    }

    public String textToAscii26x13(String text) {
        ArrayList<String[][]> lettersInAsci = new ArrayList<>();
        for (char c : text.toUpperCase().toCharArray()) {
            lettersInAsci.add(getLetter(c));
        }
        // split it to lines, each line is 24 characters long (it starts with space, and ends with space so it's 26)
        ArrayList<ArrayList<String[][]>> lines = new ArrayList<>();
        ArrayList<String[][]> currentLine = new ArrayList<>();

        int totalAdded = 2;
        currentLine.add(getLetter(' '));
        for (String[][] letter : lettersInAsci) {
            int width = letter[0].length;
            if (totalAdded + width > 26) {
                lines.add(currentLine);
                currentLine = new ArrayList<>();
                totalAdded = 2;
                currentLine.add(getLetter(' '));
            }
            currentLine.add(letter);
            currentLine.add(getLetter(' '));
            totalAdded += width + 1;
        }


        lines.add(currentLine);

        // convert the lines to a string
        StringBuilder result = new StringBuilder();
        for (ArrayList<String[][]> line : lines) {
            int totalCharsAdded = 0;
            for (int i = 0; i < 5; i++) {
                for (String[][] letter : line) {
                    for (String s : letter[i]) {
                        result.append(s);
                        totalCharsAdded++;
                    }
                }
                if(totalCharsAdded < 26) {
                    result.append("░".repeat(Math.max(0, 26 - totalCharsAdded)));
                }
                totalCharsAdded = 0;
                result.append("\n");
            }

            result.append("░░░░░░░░░░░░░░░░░░░░░░░░░░\n");

        }

        return result.toString();
    }

    private String[][] getLetter(char c) {
        String[][] letter = asciiArtMap.get(String.valueOf(c));
        if (letter == null) {
            letter = asciiArtMap.get("░");
        }
        return letter;
    }

}
