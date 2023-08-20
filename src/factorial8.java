import java.util.Scanner;

public class factorial8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.nextLine();
        int n = b.length()-1;
      int c =1;
        for (int i = a; i >0 ; i-=n) {
            c = c*i;

        }
        System.out.println(c);

    }
}
