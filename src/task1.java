import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        if (n1*n2==n3) {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


    }

}
