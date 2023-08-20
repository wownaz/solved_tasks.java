

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2  {
    public static void bin2Dec (String s) throws BinaryFormatException {
        //    0 1 0 1 1 0 1 0
        char[] ch=s.toCharArray ();
        for (char c:ch) {
            boolean ok=true;
            if(c!='0'){
                if(c!='1') ok=false;
            }
            else if(c!='1'){
                if(c!='0') ok=false;
            }
            if(!ok) throw new BinaryFormatException();
        }
        System.out.println (s);
    }
    public static void main(String[] args) throws BinaryFormatException {
        String binary="01101010101";
        bin2Dec(binary);

    }
}
