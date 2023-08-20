import java.util.ArrayList;
import java.util.LinkedList;
public class Office
{
    public static void main(String[] args)
    {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("0.Static Memory Allocation");
        arr1.add("1.Faster element access");
        arr1.add("2.Inefficient insertion/deletion");
        System.out.println("ArrayList object properties :" +  arr1);
        if (arr1.contains("1.Faster element access"))
            System.out.println("Present");
        else
            System.out.println("Not Present");
        LinkedList<String> linklist1 = new LinkedList();
        linklist1.add("0.Dynamuc Memory Allocation");
        linklist1.add("1.Slower element access");
        linklist1.add("2.Faster insertion/deletion");
        System.out.println("LinkedList object Properties :" + linklist1);
        if (linklist1.contains("1.Slower element access"))
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}