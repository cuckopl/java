package lessons;

import java.io.*;

public class Loops {

    private static String [] toEscape = {
            "1","2","3","4","5","6","7","8","9",
    };
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\start.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            System.out.println(escapeChars(line));
        }
    }


    private static String escapeChars(String string) {

        string = string.replaceAll("[^a-zA-Z\\s]"," ");
        string = string.replaceAll("\\s+"," ");
        string = string.trim();
        string = string.toLowerCase();

        return string;
    }
}
