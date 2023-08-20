import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SborCherniki {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }

   int max = arr[0]+ arr[n-1]+ (arr[1]>arr[n-2]?arr[1]:arr[n-2]);

        for (int i = 1; i < n-1; i++) {
            if(arr[i-1]+arr[i]+ arr[i+1]>max){
                max = arr[i-1]+arr[i]+ arr[i+1];
            }
        }
        System.out.println(max);

    }
    }

