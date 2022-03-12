package 剑指offer;


import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer06_从尾到头打印链表 {
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack() ;
            while( head != null ){
                stack.push(head.val) ;
                head = head.next ;
            }
            int[] ans = new int[stack.size()] ;
            int index = 0 ;
            while( !stack.empty() ){
                ans[index++] = stack.pop() ;
            }
            return ans ;
        }
    }
}
