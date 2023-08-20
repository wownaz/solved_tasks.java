import java.util.Scanner;

public class nzk {
    public static void main(String[] args) {
        Scanner noz = new Scanner(System.in);
        int n1 = (int)(Math.random()* 10);
        System.out.println("what is the number? ");
        int userIn = noz.nextInt();
        if (userIn < n1) {
            System.out.println("too low");
        } else if (userIn> n1) {
            System.out.println("too high");

        }
        while (userIn != n1) {
            System.out.println("correct");
             userIn = noz.nextInt();
        }
    }
}
