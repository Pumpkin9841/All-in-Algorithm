package 代码随想录.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 15:34
 */
public class lc104_二叉树的最大深度 {
    //递归解法
    class Solution {
        public int maxDepth(TreeNode root) {
            if( root == null ){
                return 0 ;
            }
            int left = maxDepth(root.left) ;
            int right = maxDepth(root.right) ;
            return Math.max(left , right) + 1 ;
        }
    }

    //迭代法
    class Solution1 {
        public int maxDepth(TreeNode root) {
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            int deepth = 0 ;
            while( q.size() != 0 ){
                int size = q.size() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                deepth++ ;
            }
            return deepth ;
        }
    }
}
