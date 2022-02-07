package 代码随想录.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 15:14
 */
public class lc116_填充每个节点的下一个右侧节点指针 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {
            Queue<Node> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                for( int i = 0 ; i < size ; i++ ){
                    Node node = q.poll() ;
                    node.next = (i == size-1? null : q.peek()) ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
            }
            return root ;
        }
    }
}
