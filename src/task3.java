import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < 94 || b < 94 || c < 94 || a > 747 || b > 747 || c > 747) {
            System.out.println("Error");
            return;
        }

        else if (a>b && a>c) {
            System.out.println(a);
        }
        else if (b>a && b>c) {
            System.out.println(b);
        }
        else if (c>a && c>b) {
            System.out.println(c);
        }


        else {
            System.out.println(a);
        }


        }


    }

