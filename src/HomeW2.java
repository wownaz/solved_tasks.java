import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class HomeW2  {
        public static void bin2Dec (String string) throws BinaryFormatException {
            char[] sym=string.toCharArray ();
            for (char c: sym) {
                boolean b=true;
                if(c!='0'&& c!='1'){
                    b=false;
                }
                if(!b)
                    throw new BinaryFormatException();
            }
            System.out.println(string);
        }
        public static void main(String[] args) throws BinaryFormatException {
            String binary="011011";
            bin2Dec(binary);   }
        public static class BinaryFormatException extends Exception {
            public BinaryFormatException() {
                super("not a binary string");
            }
        }
    }

