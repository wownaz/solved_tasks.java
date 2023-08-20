import java.util.*;

// You aren't able to modify class and method description
class Solut {
    public int solve(int[] a, long n, long k) {
        // Write your code here..
        //2 2
        //1 2

        // 6 5 3 1 2 4
        // 6 3 1 2 4 5
        // 6 1 2 4 5 3
        // 6 2 4 5 3 1
        // 6 4 5 3 1 2
        // 6 5 3 1 2 4
        // 6 3 1 2 4 5
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
            max = a[i];
            }
        }

        return max;
    }
}

// Don't modify these lines below.

public class TableTennis {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong(), k = in.nextLong();
        int[] a = new int[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }


        Solut sol = new Solut();
        System.out.println(sol.solve(a, n, k));
    }

}