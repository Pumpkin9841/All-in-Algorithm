package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer35_复杂链表的复制 {
    class Solution {
        Map<Node,Node> map = new HashMap() ;
        public Node copyRandomList(Node head) {
            if( head == null ){
                return null ;
            }
            if( !map.containsKey(head) ){
                Node newNode = new Node(head.val) ;
                map.put(head , newNode) ;
                newNode.next = copyRandomList(head.next) ;
                newNode.random = copyRandomList(head.random) ;
            }
            return map.get(head) ;
        }
    }
}
