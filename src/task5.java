import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2==0) {
            System.out.println(n/2);
        }
        else if (n==1) {
            System.out.println(0);
        }
        else {
            System.out.println(n);
        }
    }
}
