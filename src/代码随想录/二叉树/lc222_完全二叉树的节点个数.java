package 代码随想录.二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/8 0008 下午 19:25
 */
public class lc222_完全二叉树的节点个数 {
    class Solution {
        public int countNodes(TreeNode root) {
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            int num = 0 ;
            while( q.size() != 0 ){
                int size = q.size() ;
                num += size ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
            }
            return num ;
        }
    }

    //通用的递归解法
    class Solution1 {
        public int countNodes(TreeNode root) {
            if( root == null ){
                return 0 ;
            }
            return countNodes(root.left) + countNodes(root.right) + 1 ; //左子树节点数 + 右子树节点树 + 中间的节点树1
        }
    }

    //完全二叉树解法
    class Solution2 {
        /**
         * 针对完全二叉树的解法
         *
         * 满二叉树的结点数为：2^depth - 1
         */
        public int countNodes(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int leftDepth = getDepth(root.left);
            int rightDepth = getDepth(root.right);
            if (leftDepth == rightDepth) {// 左子树是满二叉树
                // 2^leftDepth其实是 （2^leftDepth - 1） + 1 ，左子树 + 根结点
                return (1 << leftDepth) + countNodes(root.right);
            } else {// 右子树是满二叉树
                return (1 << rightDepth) + countNodes(root.left);
            }
        }

        private int getDepth(TreeNode root) {
            int depth = 0;
            while (root != null) {
                root = root.left;
                depth++;
            }
            return depth;
        }
    }
}
