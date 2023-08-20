import java.util.Scanner;

public class progr6 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int s = b-a;
        int n = a+ (c-1)*s;
        System.out.println(n);
    }
}
