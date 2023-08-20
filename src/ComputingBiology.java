import java.util.Scanner;

public class ComputingBiology {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();

        String ans = "";
        int a = -1;
        for (int i = 0; i < s.length(); ++i) {
            a = t.indexOf(s.charAt(i),a+1);
            if(a<0){
                ans = "NO";
            }else
            {
                ans = "YES";
            }
        }
        System.out.println(ans);
    }
}
