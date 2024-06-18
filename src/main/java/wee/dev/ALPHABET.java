package wee.dev;

import java.util.ArrayList;

public class ALPHABET {

    public static final String[][] A = {
            {"░", "█", "░"},
            {"█", "░", "█"},
            {"█", "█", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"}
    };

    public static final String[][] B = {
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "█", "░"}
    };

    public static final String[][] C = {
            {"░", "█", "█"},
            {"█", "░", "░"},
            {"█", "░", "░"},
            {"█", "░", "░"},
            {"░", "█", "█"}
    };

    public static final String[][] D = {
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "█", "░"}
    };

    public static final String[][] E = {
            {"█", "█", "█"},
            {"█", "░", "░"},
            {"█", "█", "░"},
            {"█", "░", "░"},
            {"█", "█", "█"}
    };

    public static final String[][] F = {
            {"█", "█", "█"},
            {"█", "░", "░"},
            {"█", "█", "░"},
            {"█", "░", "░"},
            {"█", "░", "░"}
    };

    public static final String[][] G = {
            {"░", "█", "█"},
            {"█", "░", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "█"}
    };

    public static final String[][] H = {
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "█", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"}
    };

    public static final String[][] I = {
            {"█", "█", "█"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"█", "█", "█"}
    };

    public static final String[][] J = {
            {"░", "░", "█"},
            {"░", "░", "█"},
            {"░", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"}
    };

    public static final String[][] K = {
            {"█", "░", "█"},
            {"█", "█", "░"},
            {"█", "░", "░"},
            {"█", "█", "░"},
            {"█", "░", "█"}
    };

    public static final String[][] L = {
            {"█", "░", "░"},
            {"█", "░", "░"},
            {"█", "░", "░"},
            {"█", "░", "░"},
            {"█", "█", "█"}
    };

    public static final String[][] M = {
            {"█", "░", "░", "░", "█"},
            {"█", "█", "░", "█", "█"},
            {"█", "░", "█", "░", "█"},
            {"█", "░", "░", "░", "█"},
            {"█", "░", "░", "░", "█"}
    };

    public static final String[][] N = {
            {"█", "░", "░", "█"},
            {"█", "█", "░", "█"},
            {"█", "░", "█", "█"},
            {"█", "░", "░", "█"},
            {"█", "░", "░", "█"}
    };

    public static final String[][] O = {
            {"░", "█", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"}
    };

    public static final String[][] P = {
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "█", "░"},
            {"█", "░", "░"},
            {"█", "░", "░"}
    };

    public static final String[][] Q = {
            {"░", "█", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "█", "░"},
            {"░", "█", "█"}
    };

    public static final String[][] R = {
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "█", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"}
    };

    public static final String[][] S = {
            {"░", "█", "█"},
            {"█", "░", "░"},
            {"░", "█", "░"},
            {"░", "░", "█"},
            {"█", "█", "░"}
    };

    public static final String[][] T = {
            {"█", "█", "█"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "█", "░"}
    };

    public static final String[][] U = {
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"}
    };

    public static final String[][] V = {
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"},
            {"░", "█", "░"}
    };

    public static final String[][] W = {
            {"█", "░", "░", "░", "█"},
            {"█", "░", "░", "░", "█"},
            {"█", "░", "█", "░", "█"},
            {"█", "█", "░", "█", "█"},
            {"█", "░", "░", "░", "█"}
    };

    public static final String[][] X = {
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"},
            {"█", "░", "█"},
            {"█", "░", "█"}
    };

    public static final String[][] Y = {
            {"█", "░", "█"},
            {"█", "░", "█"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "█", "░"}
    };

    public static final String[][] Z = {
            {"█", "█", "█"},
            {"░", "░", "█"},
            {"░", "█", "░"},
            {"█", "░", "░"},
            {"█", "█", "█"}
    };


    public static final String[][] SPACE = {
            {"░"},
            {"░"},
            {"░"},
            {"░"},
            {"░"}
    };
    public static final String[][] filled_space = {
            {"█"},
            {"█"},
            {"█"},
            {"█"},
            {"█"}
    };

    public static final String[][] WARNING_MARK = {
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "█", "░"},
            {"░", "░", "░"},
            {"░", "█", "░"}
    };

    public static String textToAscii26x13(String text) {

        ArrayList<String[][]> lettersInAsci = new ArrayList<>();
        for (char c : text.toUpperCase().toCharArray()) {
            lettersInAsci.add(getLetter(c));
        }
        // split it to lines, each line is 24 characters long (it starts with space, and ends with space so it's 26)
        ArrayList<ArrayList<String[][]>> lines = new ArrayList<>();
        ArrayList<String[][]> currentLine = new ArrayList<>();

        int totalAdded = 2;
        currentLine.add(SPACE);
        for (String[][] letter : lettersInAsci) {
            int width = letter[0].length;
            if (totalAdded + width > 26) {
                lines.add(currentLine);
                currentLine = new ArrayList<>();
                totalAdded = 2;
                currentLine.add(SPACE);
            }
            currentLine.add(letter);
            currentLine.add(SPACE);
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

    private static String[][] getLetter(char c) {
        return switch (c) {
            case 'A' -> A;
            case 'B' -> B;
            case 'C' -> C;
            case 'D' -> D;
            case 'E' -> E;
            case 'F' -> F;
            case 'G' -> G;
            case 'H' -> H;
            case 'I' -> I;
            case 'J' -> J;
            case 'K' -> K;
            case 'L' -> L;
            case 'M' -> M;
            case 'N' -> N;
            case 'O' -> O;
            case 'P' -> P;
            case 'Q' -> Q;
            case 'R' -> R;
            case 'S' -> S;
            case 'T' -> T;
            case 'U' -> U;
            case 'V' -> V;
            case 'W' -> W;
            case 'X' -> X;
            case 'Y' -> Y;
            case 'Z' -> Z;
            case ' ' -> SPACE;
            case '!' -> WARNING_MARK;
            default -> null;
        };
    }



}
