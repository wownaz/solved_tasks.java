import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class bbujb {
    public static int[][] addMatrix(int[][]a,int[][]b) {

            int[][] arr = new int[3][3];
            for (int i=0;i<3;i++) {
                for (int j=0; j<3;j++) {
                    arr[i][j]=a[i][j] + b[i][j];
                }
            }
            return arr;
        }
        public static void main(String []args) {
            Scanner sc = new Scanner(System.in);
            int [][]arr1 = new int[3][3];
            int [][]arr2 = new int[3][3];
            System.out.println("ENTER ARR1:");
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    arr1 [i][j] = sc.nextInt();
                }
            }
            System.out.println("WRITE HERE ARR2:");
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    arr2 [i][j] = sc.nextInt();
                }
            }

            int[][]obwi = addMatrix(arr1,arr2);
            for (int i=0; i<3;i++) {
                for (int j=0; j<3;j++) {
                    System.out.println(obwi[i][j]+ " ");
                }
                System.out.println();
            }
        }





}
