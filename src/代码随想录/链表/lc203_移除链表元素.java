package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/7 0007 上午 10:53
 */
public class lc203_移除链表元素 {

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            //创建头结点
            ListNode dummy = new ListNode(-1 , head) ;
            ListNode pre = dummy ;
            ListNode curr = head ;
            while( curr != null ){
                if( curr.val == val ){
                    pre.next = curr.next ;
                    curr = curr.next ;
                }
                else if( curr.val != val ){
                    pre = curr ;
                    curr = curr.next ;
                }
            }
            return dummy.next;
        }
    }
}

class ListNode {
      int val;
     ListNode next;
     ListNode() {

     }
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
}