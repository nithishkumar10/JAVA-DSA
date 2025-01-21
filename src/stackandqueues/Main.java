package stackandqueues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(19);
//        stack.push(20);
//        stack.push(85);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(52);
//        queue.add(85);
//        queue.add(77);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.remove();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if((str.charAt(i) == ')' && stack.peek() == '(') || (str.charAt(i) == '}' && stack.peek() == '{') || (str.charAt(i) == ']' && stack.peek() == '[')) {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
