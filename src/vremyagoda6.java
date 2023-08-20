import java.util.Scanner;

public class vremyagoda6 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>2 && n<6){
            System.out.println("Spring");
        }
        else if (n==12 || (n>0 && n<3 )) {
            System.out.println("Winter");
        }
        else if (n>5 && n<9) {
            System.out.println("Summer");
        }
        else if (n>8 && n<12) {
            System.out.println("Autumn");
        }
            else {
            System.out.println("Error");
        }
    }
}
