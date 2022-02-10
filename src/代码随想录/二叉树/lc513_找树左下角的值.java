package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 12:10
 */
public class lc513_找树左下角的值 {
    //迭代，层序遍历，返回层序遍历的最后一层的第一个元素
    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            List<List<Integer>> ret = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> list = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    list.add(node.val) ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                ret.add(list) ;
            }
            return ret.get(ret.size()-1).get(0) ;
        }
    }

    //递归
    class Solution1 {
        int maxDeep = -1 ;
        int value = 0 ;
        public int findBottomLeftValue(TreeNode root) {
            value = root.val ;
            traversal( root , 0 ) ;
            return value ;
        }

        public void traversal(TreeNode root , int deep){
            if( root == null ){
                return ;
            }
            if( root.left == null && root.right == null ){
                if( deep > maxDeep ){
                    maxDeep = deep ;
                    value = root.val ;
                }
            }
            if( root.left != null ){
                traversal(root.left , deep+1) ;
            }
            if( root.right != null ){
                traversal(root.right , deep+1) ;
            }
        }
    }
}
