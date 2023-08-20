import java.lang.reflect.Array;
import java.util.*;

public class Solution4 {
    private static Object args;

    public static String anagram(String st1, String st2) {
        String he = "";
        String hi = "";
        st1=st1.toLowerCase();
        st2=st2.toLowerCase();
        char[]a1 = st1.toCharArray();
        char []a2 = st2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        String fk1 = new String(a1);
        String fk2 = new String(a2);
        if (fk1==fk2) {
            return "Yes";}
            else
                return "No";
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String jaz1 = scan.nextLine();
            String jaz2 = scan.nextLine();
            jaz1 = jaz1.substring(8);
            jaz2 = jaz2.substring(8);
            if (jaz1.length()==jaz2.length()) {
                System.out.println(anagram(jaz1,jaz2));
            }
            else
                System.out.println("both strings must have the same length");
            }
            }