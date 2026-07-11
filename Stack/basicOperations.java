import java.util.Stack;

public class basicOperations{
    public static void main(String args[]){
        Stack <Integer> stack =  new Stack<>();
        System.out.println(stack.push(10));
        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.push(40));
        System.out.println(stack.push(50));
        System.out.println(stack.push(60));

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.clear();
        
    } 
}