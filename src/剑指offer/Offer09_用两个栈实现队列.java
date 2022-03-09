package 剑指offer;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/3/9
 */
public class Offer09_用两个栈实现队列 {
    class CQueue {

        Stack<Integer> st1 ;
        Stack<Integer> st2 ;

        public CQueue() {
            st1 = new Stack() ;
            st2 = new Stack() ;
        }

        public void appendTail(int value) {
            st1.push(value) ;
        }

        public int deleteHead() {
            if( st1.empty() ){
                return -1 ;
            }
            while( !st1.empty() ){
                st2.push(st1.pop()) ;
            }
            int ret = st2.pop() ;
            while( !st2.empty() ){
                st1.push(st2.pop()) ;
            }
            return ret ;
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
