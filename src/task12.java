import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String f = scan.nextLine();
        String[] fa = f.split(" ");
        String[][] array1 = new String[Integer.parseInt(fa[0])][Integer.parseInt(fa[1])];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = scan.next();
                }
            }
            String[][] array2 = new String[Integer.parseInt(fa[0])][Integer.parseInt(fa[1])];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j]=scan.next();
            }
        }
        scan.close();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array2[i][j]=="B"){
                    array2[i][j].equals("W");
                }
                else{
                    array2[i][j].equals("B");
                }
            }

        }





        }
        }





