public class jgkh {
    public static void main(String[]args) {
        int[] arr = new int[7];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i]+ " ");
        }
        System.out.println("Sorted");
        for (int i =0; i< arr.length;i++) {
            for (int j=0; j< arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int i=0 ; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
