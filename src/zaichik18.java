import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class zaichik18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int [] arr = new int[n+1];

        arr[1]=1;
        for (int i = 2; i < n ; i++) {
            for (int j = 0; j <=k  && i-j>=0; j++) {
                arr[i]=arr[i]+arr[i-j];
            }
        }

    }

}
