package 剑指offer;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/3/9
 */
public class Offer30_包含min函数的栈 {
    class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> stack ,stack2;
        public MinStack() {
            stack = new Stack() ;
            stack2 = new Stack() ;
        }

        public void push(int x) {
            stack.push(x) ;
            if( stack2.empty() || stack2.peek() >= x ){
                stack2.push(x) ;
            }
        }

        public void pop() {
            if( stack.pop().equals(stack2.peek()) ){
                stack2.pop() ;
            }
        }

        public int top() {
            return stack.peek() ;
        }

        public int min() {
            return stack2.peek() ;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
