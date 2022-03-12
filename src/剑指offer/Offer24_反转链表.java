package 剑指offer;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer24_反转链表 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null ;
            ListNode p = head ;
            while( p != null ){
                ListNode temp = p.next ;
                p.next = pre ;
                pre = p ;
                p = temp ;
            }
            return pre ;
        }
    }
}
