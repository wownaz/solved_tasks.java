import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resu {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        String time = "";
        String [] words = {"","one", "two", "three","four","five","six","seven","eight","nine","ten","eleven","twelve",
                          "thirteen","fourteen","fifteen", "sixteen","seventeen", "eighteen","nineteen", "twenty","twenty one",
                            "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine",};
        if(m==0) {
          time= words[h]+"o'clock";
        }
        else if(m==15) {
            time = "quarter past "+ words[h];
        }
        else if(m==30){
            time = "half past "+words[h];
        }
        else if(m==45) {
            time= "quarter to "+ words[h];
        }
        else if(m<30){
            time = words[m]+ " minutes past "+ words[h];
        }
        else{
            time = words[60-m]+ " minutes to "+ words[h];
        }

        return time;
        }

}

public class TimeInWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Resu.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
