import java.util.Scanner;

public class task13 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 0 1 1 2 3 5 8 13 21

        int a=0;
        int b=1;
        int c =0;
        for (int i = 0; i < n; i++) {
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }
}
