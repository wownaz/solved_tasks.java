import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Solution1 {

    public static void main (String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        FileReader fr = new FileReader (scan.nextLine());
        BufferedReader br = new BufferedReader (fr);

        String line = br.readLine();

        int wordsCount = 0;
        int lineCount =0;
        int chCount = 0;
        while (line!= null) {
            String[] words = line.split(" ");
            for (String w : words) {
                chCount+= w.length();
                wordsCount++;

            }
            line = br.readLine();

            lineCount++;
        }
        chCount--;

        System.out.println("has\n"+chCount+" characters\n"+wordsCount+" words\n"+lineCount+" lines");
    }
}