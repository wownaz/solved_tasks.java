import java.util.Scanner;

public class vremyaprib7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int h = scan.nextInt();
        int m = scan.nextInt();
        String [] time = s.split(":");
        int[] time1 = new int[2];
        for (int i = 0; i < time.length; i++) {
            time1[i] = Integer.parseInt(time[i]);
        }
        int t1 = time1[0]+ h;
        int t2 = time1[1]+ m;

        t1= t1%24;
        if(t2>=60)
        {
            t1++;
            t2=t2%60;

        }

        if (t1>=10 && t2>=10 && t1<24 && t2<60){
            System.out.println(t1+":"+t2);
        }

        if (t1<10 && t2<10){
            System.out.println("0"+t1+":"+"0"+t2);
        }

    }
}