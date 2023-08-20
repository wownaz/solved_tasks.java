import java.util.Scanner;

public class MinimumPathToTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int [][]  a = new int[N][M];

        for(int i = 1; i < N; ++i) {
            a[i][0] = arr[i][0] + a[i - 1][0];
        }
        for(int i = 1; i < M; ++i) {
            a[0][i] = arr[0][i] + a[0][i - 1];
        }
        for(int i = 1; i < N; ++i) {
            for(int j = 1; j < M; ++j) {
                a[i][j] = Math.min(a[i - 1][j], a[i][j - 1]) + arr[i][j];
            }
        }
        System.out.println(a[N-1][M-1]+1);
    }
    }

