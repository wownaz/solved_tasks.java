
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class highestprof {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int prof = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1])
                prof+= arr[i]-arr[i-1];
        }

        System.out.println(prof);

    }
}