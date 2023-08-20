import java.util.Scanner;

public class hudozhnik17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr1 = new int[4][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[w][h] = scan.nextInt();
            }
        }


        int[][] arrSpace = new int[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
              
            }
        }
    }
}
/*
 public static int findIndex(int[][] array , int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==a){
                    return i;
                }
            }
        }
        return -1;
    }
}
 */

