package 代码随想录.链表;

/**
 * @author pumpkin
 * @date 2022/1/13 0013 下午 15:02
 */
public class lc142_环形链表2 {
    /**
     * https://programmercarl.com/0142.%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8II.html#_142-%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8ii
     * */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while( fast != null && fast.next != null ){
            //慢指针每次移动1位
            slow = slow.next ;
            //快指针每次移动2位
            fast = fast.next.next ;
            //有环
            if( slow == fast ){
                ListNode startNode = head ;
                ListNode meetNode = fast ;
                while( startNode != meetNode ){
                    startNode = startNode.next ;
                    meetNode = meetNode.next ;
                }
                return meetNode ;
            }
        }
        return null ;
    }
}
