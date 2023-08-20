import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int num = (int)(Math.random()*201);
        Scanner sc = new Scanner(System.in);
        System.out.println("GUESS A SUK");
        int suk = sc.nextInt();
        while (suk!=num) {
            System.out.println("TRY AGAIN");
            suk = sc.nextInt();
            if (suk==num) {
                System.out.println("YOU GOT IT");
            }
            else if (suk>num) {
                System.out.println("TOO HIGH");
            }
            else {
                System.out.println("TOO LOW");
            }

        }

    }
}
