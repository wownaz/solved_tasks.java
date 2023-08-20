
import java.util.Scanner;

public class VolosatyiBuznes {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i]= scan.nextInt();
        }
        int sum = 0;
        int max = 0;
        for (int i = N-1; i >=0; i--) {
           max = Math.max(max,arr[i]);
           sum+= max;
        }
        System.out.println(sum);
    }
}
