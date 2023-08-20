import java.util.Scanner;

public class Taskkkkk {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = arr[0] + arr[a-1] + (arr[1]>arr[a-2]?arr[1]:arr[a-2]);
        for (int i = 1; i < a-1; i++) {
            if(arr[i-1]+arr[i]+arr[i+1]>n) {
                n = arr[i-1]+arr[i]+arr[i+1];
        }
        }
        System.out.println(n);
    }
}
