import java.util.Scanner;

public class ZolotoPlemeniAbba {
    public static void main(String [] args) {

         Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();

        String r = max(a,b);
        System.out.println(max(r,c));
    }
    public static String max(String a, String b) {
        String m = null;
        if(a.length()>b.length()){
            m = a;
        }
        if(a.length()<b.length()){
            m = b;
        }
        if(a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)>b.charAt(i))
                    m = a;
                if(a.charAt(i)<b.charAt(i))
                    m = b;
        }
        }
        return a;
    }
}
