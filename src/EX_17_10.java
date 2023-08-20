import java.io.*;

public  class EX_17_10 {
    public static void main(String[]args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("Exercise17_10.dat", "rw");
        int n=3;
        int size = (int)randomAccessFile.length();
        int partsSize = size/n;
        int[]num = randomNums(100);

        byte[] bytes = new byte[partsSize];
        for (int i=1; i<=n;i++) {
            randomAccessFile.seek(partsSize*i);
            randomAccessFile.read(bytes);
            FileOutputStream fileOutputStream = new FileOutputStream("File"+i+".dat");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        }

    }
    static int []randomNums(int size) {
        int[]numbers = new int[size];
        for (int i=0; i<numbers.length; i++) {
            numbers[i]= (int)(Math.random()*100+1);
        }
        return numbers;
    }
        }

