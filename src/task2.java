import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int g = scan.nextInt();
        int l = scan.nextInt();
        int w,x;
        w = a+c+e+g;
        x= b+f+d+l;
        if (w>x){
            System.out.println("1");
        }
        else if (w<x){
            System.out.println("2");
        }
        else{
            System.out.println("DRAW");
        }



              }
          }



