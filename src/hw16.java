import java.util.Scanner;

public class hw16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.print(sum + " ");

        int max= getMaxValue(arr);
        int min = getMinValue(arr);

        int minIndex = findIndex(arr, min);
        int maxIndex = findIndex(arr, max);
        int s=1;
        if (minIndex<maxIndex){
            for (int i = minIndex+1; i < maxIndex; i++) {
                s*=arr[i];
            }
            System.out.println(s);
        }

        else if (minIndex>maxIndex){
            for (int i = maxIndex+1; i < minIndex; i++) {
                s*=arr[i];
            }
            System.out.println(s);
        }

    }
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static int findIndex(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]==a) {
             return i;
         }
        }
        return -1;
    }
}

