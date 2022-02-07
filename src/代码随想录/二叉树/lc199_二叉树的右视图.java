package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/2/7 0007 下午 14:13
 */
public class lc199_二叉树的右视图 {
    /**
     * 将二叉树从左到右，从上到下，每一层的最有一个节点加入ans，返回的数组ans即是最后结果
     */
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            while( q.size() != 0 ){
                int size = q.size() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    if( i == size-1 ){
                        ans.add(node.val) ;
                    }
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
            }
            return ans ;
        }
    }
}
