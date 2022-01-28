package 代码随想录.栈与队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/1/26 0026 下午 14:57
 */
public class lc225_用队列实现栈 {
    class MyStack {
        Queue<Integer> q1 = null ;
        Queue<Integer> q2 = null ;
        public MyStack() {
            q1 = new LinkedList() ;
            q2 = new LinkedList() ;
        }

        public void push(int x) {
            q1.offer(x) ;
        }

        public int pop() {
            while( q1.size() > 1 ){
                q2.offer(q1.poll()) ;
            }
            int result = q1.poll() ;
            while( q2.size()!=0 ){
                q1.offer(q2.poll()) ;
            }
            return result ;
        }

        public int top() {
            while( q1.size() > 1 ){
                q2.offer(q1.poll()) ;
            }
            int result = q1.peek() ;
            q2.offer(q1.poll()) ;
            while( q2.size()!=0){
                q1.offer(q2.poll()) ;
            }
            return result ;
        }

        public boolean empty() {
            return q1.size()==0?true:false ;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
