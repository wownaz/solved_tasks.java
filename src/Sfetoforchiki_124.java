import java.util.ArrayList;
import java.util.Scanner;

public class Sfetoforchiki_124 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [][] arr = new int[2][m];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 0;
        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < m; j++) {

                    if(arr[i][j]==k)
                        a++;
                }
            }
            arrayList.add(a);
            a=0;
        }
        System.out.println(arrayList.toString().replace("[", "").replace("]", "").replace(",","") );


    }
}
