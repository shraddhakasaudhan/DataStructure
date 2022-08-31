package stacks;
import java.util.Stack;
public class Stacks{
    public static void main(String[] args) {

        Stack<String> studentName = new Stack<>();

        studentName.push("Rakesh");
        studentName.push("John");
        studentName.push("Tony");
        studentName.push("Mahi");
        studentName.push("Adi");

        System.out.println("Stacks: " +studentName);

        System.out.println(studentName.peek());

        studentName.pop(); //delete top most value
        System.out.println("Stacks: " + studentName);
        System.out.println(studentName.peek());



    }
}
