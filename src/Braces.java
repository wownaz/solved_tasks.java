import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Braces {


    // Complete the braces function below.
    static String[] braces(String[] values) {
        Stack<Character> stack = new Stack<>();
        String a = values.toString();
        String [] list = new String[0];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }
            else if(stack.isEmpty()){
                list.equals("NO");
            }
            else if(ch=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    list.equals("NO");
                }
            }else if(ch==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    list.equals("NO");
                }
            }
            else if(ch==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    list.equals("NO");
                }
            }

        }
        return list;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(res[i]);

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
