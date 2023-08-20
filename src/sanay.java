import java.util.Scanner;

public class sanay {
    public static void main(String[] args) {
        int OBWI_SURAK = 5;
        int pravilnie = 0;
        int suraksany = 0;
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int jauap = sc.nextInt();
        while (suraksany==OBWI_SURAK) {
            System.out.println("JAZ NAHU");
            jauap = sc.nextInt();
            if (jauap==pravilnie) {
                suraksany++;
                System.out.println("DURS");
            }
            else if (suraksany>pravilnie) {
                System.out.println("KATE BL");

            }

        }
    }
}
