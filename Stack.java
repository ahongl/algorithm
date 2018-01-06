/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。 
 * 定义两个栈，入栈的时候入到第一个栈，出栈的时候，如果第二个栈为空，把第一个栈中的所有元素先出到第二个栈，再从第二个栈出栈来实现队列。
 */
import java.util.Stack;

public class Stack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
    	if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
