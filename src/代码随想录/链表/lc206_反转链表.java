package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/8 0008 上午 11:27
 */

public class lc206_反转链表 {
    /**
     * https://programmercarl.com/0206.%E7%BF%BB%E8%BD%AC%E9%93%BE%E8%A1%A8.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null ;
            ListNode curr = head ;
            while( curr != null ){
                ListNode temp = curr.next ;
                curr.next = pre ;
                pre = curr ;
                curr = temp ;
            }
            return pre ;
        }
    }
}
