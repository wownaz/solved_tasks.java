import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int r2 = scan.nextInt();
        int r3 = scan.nextInt();
        if (r1<=r2 || r1<=r3 || r2+r3> r1) {
            System.out.println("NO");
        }
        else   {
            System.out.println("YES");
        }
    }
}
