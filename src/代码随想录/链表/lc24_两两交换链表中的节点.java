package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/8 0008 上午 11:43
 */
public class lc24_两两交换链表中的节点 {
    //方法一：交换值
    class Solution1 {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(-1 , head) ;
            ListNode p = dummy ;
            int index = 0 ;
            while( p.next != null ){
                index++ ;
                if( index % 2 == 0 ){
                    int temp = p.next.val ;
                    p.next.val = p.val ;
                    p.val = temp ;
                }
                p = p.next ;
            }
            return dummy.next ;
        }
    }


    /**
     * https://programmercarl.com/0024.%E4%B8%A4%E4%B8%A4%E4%BA%A4%E6%8D%A2%E9%93%BE%E8%A1%A8%E4%B8%AD%E7%9A%84%E8%8A%82%E7%82%B9.html#_24-%E4%B8%A4%E4%B8%A4%E4%BA%A4%E6%8D%A2%E9%93%BE%E8%A1%A8%E4%B8%AD%E7%9A%84%E8%8A%82%E7%82%B9
     */
    //方法二：交换节点
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(-1 , head) ;
            ListNode p = dummy ;
            while( p.next != null && p.next.next != null ){
                ListNode temp = head.next.next ;
                p.next = p.next.next ;
                head.next.next = head ;
                head.next = temp ;
                p = head ;
                head = head.next ;
            }
            return dummy.next ;
        }
    }

}
