package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/9 0009 下午 13:54
 */
public class lc589_N叉树的前序遍历 {
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
        List<Integer> res = new ArrayList() ;
        public List<Integer> preorder(Node root) {
            if( root == null ){
                return res ;
            }
            res.add(root.val) ;
            if( root.children != null ){
                for( Node node : root.children ){
                    preorder(node) ;
                }
            }
            return res ;
        }
    }
}
