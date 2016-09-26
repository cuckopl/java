package lessons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindTheHighestScore {



    public static void main(String[] args) throws IOException {
        File file = new File("c:\\start2.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            parseToTable(line);
        }
    }


    private static String parseToTable(String string) {

        String[] split = string.split("\\|");
        String[] split2;
        Integer[][] multi = new Integer[10][20];
        for (int i = 0; i < split.length; i++) {
            split2 = split[i].trim().split("\\s");
            int j = 0;
            for (String str : split2) {
                multi[i][j++] = Integer.parseInt(str);
            }
        }

        Integer[] scores = new Integer[20];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                if (multi[j][i] == null) {
                    break;
                }
                if (scores[i] == null) {
                    scores[i] = multi[j][i];
                }
                if (scores[i] < multi[j][i]) {
                    scores[i] = multi[j][i];
                }
            }
        }
        String stringScore="";
        for (int i=0;i < scores.length;i++){
            if(scores[i] == null){
                break;
            }
            stringScore +=scores[i]+" ";
        }
        System.out.println(stringScore.trim());
        return "ok";
    }


}
