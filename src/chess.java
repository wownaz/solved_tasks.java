import java.util.Scanner;

public class chess {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int[][] chess = {{1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1} };

        int x1 =  scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

       if (chess[x1-1][y1-1] == ((chess[x2-1][y2-1]))){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }

    }
}
