
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Ticket15 {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int q_len = queue.size();
        for (int i = 0; i < q_len; i++) {
            int temp = queue.remove();
            if (temp < 0) {
                stack.push(temp);
            }
            else {
                queue.add(temp);
            }
        }
        q_len = queue.size();
        for (int i = 0; i < q_len; i++) {
            stack.push(queue.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-4);
        stack.push(-3);
        stack.push(2);
        stack.push(-1);
        splitStack(stack);

        System.out.println(stack.toString());
    }
}
