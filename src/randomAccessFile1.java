import java.io.*;

public  class randomAccessFile1 {
    public static void main(String[]args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("Exercise17_10.dat", "rw");
        int n=3;
        int size = (int)randomAccessFile.length();
        int partsSize = size/n;
        int[]num = randomNums(100);
        for (int w = 0; w<num.length;w++) {
            randomAccessFile.writeInt(num[w]);
        }

        byte[] bytes = new byte[partsSize];
        for (int i=1; i<=n;i++) {
            randomAccessFile.seek(partsSize*i);
            randomAccessFile.read(bytes);
            FileOutputStream fileOutputStream = new FileOutputStream("File"+i+".dat");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        }
        for (int i=1; i<=n; i++) {
            FileInputStream fileInputStream = new FileInputStream("File"+i+".dat");
            int value;
            while ((value = fileInputStream.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
    static int []randomNums(int size) {
        int[]numbers = new int[size];
        for (int i=0; i<numbers.length; i++) {
            numbers[i]= (int)(Math.random()*100);
        }
        return numbers;
    }
}
