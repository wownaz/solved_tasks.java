import java.util.Scanner;

public class Lesenka2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int [] dp = new int[N+1];

        int [] L = new int[N+1];
        dp[0]=0;
        dp[1]= arr[0];
        for (int i = 2; i < dp.length-1; i++) {
            dp[i]= Math.max(dp[i-1], dp[i-1]+ dp[i-2]);
        }

    }
}
