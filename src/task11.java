import java.lang.reflect.Array;
import java.util.*;

public class task11 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                linkedList.add(arr[i]);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i]%2!=0) {
                arrayList.add(arr[i]);
            }
        }
        int a = linkedList.size();
        int b = arrayList.size();

        System.out.println(arrayList.toString().replace("[", "").replace("]", "").replace(",","") );
        System.out.println(linkedList.toString().replace("[", "").replace("]", "").replace(",","") );
        if (a<b){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
