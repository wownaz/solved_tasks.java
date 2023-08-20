import java.io.FileOutputStream;
import java.io.IOException;

public class EX_17_2 {
    public static void main(String[]args) throws IOException {
        int[] numbers = randomNums(100);
        FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_02.dat");
        for (int i=0 ; i<numbers.length;i++) {
             fileOutputStream.write(numbers[i]);
        }
        fileOutputStream.close();
    }
    static int []randomNums(int size) {
        int[]numbers = new int[size];
        for (int i=0; i<numbers.length; i++) {
            numbers[i]= (int)(Math.random()*100);
        }
        return numbers;
    }
}
