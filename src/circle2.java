import java.util.Scanner;

public class circle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextInt();
        double y1 = scan.nextInt();
        double r1 = scan.nextInt();
        double x2 = scan.nextInt();
        double y2 = scan.nextInt();
        double r2 = scan.nextInt();


        double l =  Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        if (r1 + r2 >= l && l + r2 >= r1 && l + r1 >= r2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
