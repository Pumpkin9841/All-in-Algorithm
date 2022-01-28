package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/13 0013 下午 14:12
 */
public class lc面试题02_07_链表相交 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode dummyA = new ListNode(-1) ;
            dummyA.next = headA ;
            ListNode dummyB = new ListNode(-1) ;
            dummyB.next = headB ;
            int sizeA = 0 ;
            int sizeB = 0 ;
            ListNode p = dummyA ;
            while( p.next != null ){
                p = p.next ;
                sizeA++ ;
            }
            ListNode q = dummyB ;
            while( q.next != null ){
                q = q.next ;
                sizeB++ ;
            }
            int left = sizeA - sizeB ;
            p = dummyA ;
            q = dummyB ;
            //两个while只会执行一个
            while( left > 0 ){
                p = p.next ;
                left-- ;
            }
            left = -left ;
            while( left > 0 ){
                q = q.next ;
                left-- ;
            }

            while( q.next != null && p.next != null && q.next != p.next ){
                q = q.next ;
                p = p.next ;
            }
            return p.next ;
        }
    }
}
