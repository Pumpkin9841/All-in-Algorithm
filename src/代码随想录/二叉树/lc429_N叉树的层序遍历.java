package 代码随想录.二叉树;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 14:47
 */
public class lc429_N叉树的层序遍历 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList() ;
            Queue<Node> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> level = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    Node node = q.poll() ;
                    level.add(node.val) ;
                    if( node.children != null ){
                        for( Node t : node.children ){
                            q.offer(t) ;
                        }
                    }
                }
                ans.add(level) ;
            }
            return ans ;
        }
    }
}
