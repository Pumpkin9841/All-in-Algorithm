package 代码随想录.二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/8 0008 下午 18:33
 */
public class lc599_N叉树的最大深度 {
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
    //迭代法——层序遍历
    class Solution {
        public int maxDepth(Node root) {
            Queue<Node> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            int deepth = 0 ;
            while( q.size() != 0 ){
                int size = q.size() ;
                for( int i = 0 ; i < size ; i++ ){
                    Node node = q.poll() ;
                    if( node.children != null ){
                        for( Node temp : node.children ){
                            q.offer(temp) ;
                        }
                    }
                }
                deepth++ ;
            }
            return deepth ;
        }
    }

    //递归解法
    class Solution1 {
        public int maxDepth(Node root) {
            if( root == null ){
                return 0 ;
            }
            int deepth = 0 ;
            if( root.children != null ){
                for( Node node : root.children ){
                    deepth = Math.max(deepth , maxDepth(node)) ;
                }
            }
            return deepth+1 ;
        }
    }
}
