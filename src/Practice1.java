public class Practice1 {
    public static void main (String[] args) {
        int [] [] arr = new int[4][4];
        int i = 0;
        while (i<4) {
            arr[i][0] = i+1;
            arr[0][i] = i+1;
            i++;
        }
        System.out.println(arr);
    }
}
