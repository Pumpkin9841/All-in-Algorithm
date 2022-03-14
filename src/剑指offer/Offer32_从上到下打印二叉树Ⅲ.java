package 剑指offer;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/3/14
 */
public class Offer32_从上到下打印二叉树Ⅲ {
    //方法一 使用翻转 Collections.reverse()
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            int index = 1 ;
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> level = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    level.add(node.val) ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                if( index % 2 == 0 ){
                    Collections.reverse(level) ;
                }
                ans.add(level) ;
                index++ ;
            }
            return ans ;
        }
    }

    //方法二 使用LinkedList
    class Solution2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList() ;
            Queue<TreeNode> q = new LinkedList() ;
            if( root != null ){
                q.offer(root) ;
            }
            int index = 1 ;
            while( q.size() != 0 ){
                int size = q.size() ;
                List<Integer> level = new ArrayList() ;
                for( int i = 0 ; i < size ; i++ ){
                    TreeNode node = q.poll() ;
                    level.add(node.val) ;
                    if( node.left != null ){
                        q.offer(node.left) ;
                    }
                    if( node.right != null ){
                        q.offer(node.right) ;
                    }
                }
                if( index % 2 == 0 ){
                    Collections.reverse(level) ;
                }
                ans.add(level) ;
                index++ ;
            }
            return ans ;
        }
    }
}
