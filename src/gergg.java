import java.util.Scanner;

public class gergg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[4][4];
        int sumD=0;
        System.out.println("WRITE HERE");
        for (int i=0;i<4;i++){

            arr[i][i] = sc.nextInt();

        }
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (i==j) {
                    sumD=sumD+arr[i][j];
                }
                System.out.println("THE SUND IS "+ sumD);
            }

        }
    }

}
