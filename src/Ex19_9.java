import java.util.ArrayList;

public class Ex19_9 {
    public static void main(String[]args) {
    ArrayList<Integer>list = new ArrayList<Integer>();
    ArrayList<String>list1 = new ArrayList<String>();
    list.add(8);
    list.add(5);
    list.add(3);
    list.add(4);
    list.add(7);
    list.add(2,9);
    sort(list);
        System.out.println(list);

        list1.add("Q");
        list1.add("a");
        list1.add("A");
        list1.add("q");
        list1.add("Ao");
        list1.add("s");
        sort(list1);
        System.out.println(list1);

    }
    public static <E extends Comparable<E>> void sort(ArrayList<E>list) {
        E min;
        ArrayList<E> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {

            for (int j = 1; j < list.size()-i; j++) {
                if (list.get(j-1).compareTo(list.get(j)) > 0) {
                    min= list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j,min);
                }
            }
        }
    }
}