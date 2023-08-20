
import sun.security.util.ArrayUtil;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ObwieCCifri {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String s3 = in.next();
        int[] digits = new int[100];
        for(int i=0; i<s1.length(); i++){
            int curr = (int)s1.charAt(i)-48;
            if (digits[curr] == 0)
                digits[curr] = 1;
        }
        for(int i=0; i<s2.length(); i++){
            int curr = (int)s2.charAt(i)-48;
            if (digits[curr] == 1)
                digits[curr] = 2;
        }
        int ans = 0;
        for(int i=0; i<s3.length(); i++){
            int curr = (int)s3.charAt(i)-48;
            if (digits[curr] == 2 ) {
                digits[curr] = 3;
                ans++;
            }
        }
        System.out.println(ans);
        if (ans > 0){
            for(int i=0; i<100; i++){
                if (digits[i] == 3)
                    System.out.print(i + " ");
            }
        }




















       /* ArrayList<String> ar1 = new ArrayList<>();
        ar1.add(a);
        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add(b);
        ArrayList<String> ar3 = new ArrayList<>();
        ar3.add(c);

        ArrayList<String> arr = new ArrayList<>();
        ar3.add(c);
        for (int i = 0; i < ar1.size(); ++i) {
            for (int j = 0; j < ar2.size(); ++j) {
                if(ar1.get(i)==ar2.get(j)){
                    for (int k = 0; k < ar3.size(); ++k) {
                        if(ar1.get(i)==ar3.get(k)){
                            arr.add(ar1.get(i));
                        }
                    }
                }
            }
        }
        Collections.sort(arr);
        ArrayList<String> arrr = new ArrayList<>();
        for (int i = 1; i < arr.size(); i++) {

            if(arr.get(i)==arr.get(i-1)){

            }


        }
        System.out.println(arrr.size());
        System.out.println(arrr+" ");
        */
    }
}