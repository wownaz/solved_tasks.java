
import java.io.*;

    public class EX_17_12 {

        public static void main(String[] args) throws Exception {
            int num = 3;
            RandomAccessFile[] sourceFile = new RandomAccessFile[num];
            try (
                    RandomAccessFile finalFile = new RandomAccessFile("Ex.dat", "rw");
            ) {
                for (int i = 0; i < sourceFile.length; i++)
                {
                    sourceFile[i] = new RandomAccessFile("Ex.dat", "r");
                }
            }
        }
    }



