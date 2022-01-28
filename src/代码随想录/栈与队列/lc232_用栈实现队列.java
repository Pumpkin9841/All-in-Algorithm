package 代码随想录.栈与队列;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/26 0026 下午 14:44
 */
public class lc232_用栈实现队列 {
    class MyQueue {

        private int front;
        Stack<Integer> stack1 = null ;
        Stack<Integer> stack2 = null ;
        public MyQueue() {
            stack1 = new Stack() ;
            stack2 = new Stack() ;
        }

        public void push(int x) {
            stack1.push(x) ;
        }

        public int pop() {
            while( !stack1.empty() ){
                stack2.push(stack1.pop()) ;
            }
            int result = stack2.pop() ;
            while( !stack2.empty() ){
                stack1.push(stack2.pop()) ;
            }
            return result ;
        }

        public int peek() {
            while( !stack1.empty() ){
                stack2.push(stack1.pop()) ;
            }
            int result = stack2.peek() ;
            while( !stack2.empty() ){
                stack1.push(stack2.pop()) ;
            }
            return result ;
        }

        public boolean empty() {
            return stack1.empty()?true:false ;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
