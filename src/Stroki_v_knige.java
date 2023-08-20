import java.util.Scanner;

public class Stroki_v_knige {
    public static void main(String [] args) {
        // input: 	15 43
        //output:    3 13
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int div = m%n;
        int page = 0;
        if (n>m) {
            System.out.println(1+" "+ m);
        }
        if(n<m){
            if (div>0){
                System.out.println((m/n+1)+" "+ div);

            }
        }
    }
}
