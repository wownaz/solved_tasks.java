import java.util.Scanner;

public class task10 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int min = b/2+ b%2;
        int max = a;
        if (a==1 && b==2){
            System.out.println(1 +" "+1);
        }
        else if (a==2 && b==3) {
            System.out.println(2+" "+2);
        }
        else
        {
            System.out.println(min+" "+max);
        }
    }
}
