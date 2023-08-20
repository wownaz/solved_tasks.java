public class Ex19_5 {
    public static void main(String[] args) {
    Integer[] array = {2, 5, 8, 4, 14, 10};
        System.out.println(max(array));
    }

    public static <E extends Comparable<E>> E max(E[] array) {
        E temp= array[0];
        for (int i=1; i< array.length; i++) {

              if (array[i].compareTo(temp)>0) {
                  temp = array[i];
              }
        }
        return temp;
    }
}