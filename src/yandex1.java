
import java.util.Scanner;

public class yandex1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String a1 = scan.nextLine();
        String a2 = scan.nextLine();
        char[] a11 = a1.toCharArray();
        char[] a22 = a2.toCharArray();
        int i=0;
        while (i<a22.length){
            for (int j = 0; j < a11.length;j++) {
                if (a22[i]==a11[i]){
                    i++;
                    System.out.println("correct");
                }
                else if (a22[i]==a11[j]){
                    i++;
                    System.out.println("present");
                }
                else {
                    i++;
                    System.out.println("absent");
                }

            }
        }


    }
}
