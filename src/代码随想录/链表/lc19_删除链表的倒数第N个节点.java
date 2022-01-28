package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/8 0008 下午 12:23
 */
public class lc19_删除链表的倒数第N个节点 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1 , head) ;
            ListNode left = dummy ;
            ListNode right = left ;
            for( int i = 1 ; i <= n ; i++ ){
                right = right.next ;
            }
            while( right.next != null ){
                right = right.next ;
                left = left.next ;
            }

            left.next = left.next.next ;
            return dummy.next ;
        }
    }
}
