import java.util.LinkedList;

public class LinkedL1ex {

    public static void main(String[] args) {

        String str1 = new String("AAA");
        String str2 = new String("BBB");
        String str3 = new String("CCC");
        String str4 = new String("DDD");
        String str5 = new String("EEE");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(str1);
        linkedList.add(str3);
        linkedList.add(1, str2);

        linkedList.remove(1);

        linkedList.addFirst(str4);
        linkedList.addLast(str5);

        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());



        System.out.println(linkedList);

    }
}