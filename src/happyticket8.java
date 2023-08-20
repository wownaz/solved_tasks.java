import java.util.Scanner;

public class happyticket8 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a1 = n/100000;
        int a2 = (n-a1*100000)/10000;
        int a3 = (n-a1*100000-a2*10000)/1000;
        int a4 = (n-a1*100000-a2*10000-a3*1000)/100;
        int a5 = (n-a1*100000-a2*10000-a3*1000-a4*100)/10;
        int a6 = n%10;
        if (a1+a2+a3==a4+a5+a6) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
