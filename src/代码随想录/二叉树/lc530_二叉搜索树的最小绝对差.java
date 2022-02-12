package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/12 0012 下午 14:18
 */
public class lc530_二叉搜索树的最小绝对差 {
    //方法一，先用中序遍历得到有序数组，再计算有序数组中任意两个元素的最小绝对差
    class Solution {
        List<Integer> list = new ArrayList() ;
        public int getMinimumDifference(TreeNode root) {
            inorder(root) ;
            return getMinDiff(list , 2) ;
        }
        public void inorder(TreeNode root){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            list.add(root.val) ;
            inorder(root.right) ;
        }

        /**
         * 滑动窗口思想计算有序数组中任意k个数的最小绝对差
         * 可用作模板
         * @param list 有序数组
         * @param k 滑动窗口大小
         * @return 最小绝对差
         */
        public int getMinDiff(List<Integer> list , int k){
            int min = Integer.MAX_VALUE ;
            for( int i = 0 ; i+k-1 < list.size() ; i++ ){
                min = Math.min(min , list.get(i+k-1)-list.get(i)) ;
            }
            return min ;
        }
    }

    //方法二，在中序遍历二叉搜索树的过程中，计算最小绝对差
    //用pre记录当前节点curr的前一个节点
    class Solution1 {
        TreeNode pre = null ;
        int min = Integer.MAX_VALUE ;
        public int getMinimumDifference(TreeNode root) {
            if( root == null ){
                return 0 ;
            }
            inorder(root) ;
            return min ;
        }
        public void inorder( TreeNode root ){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            if( pre != null ){
                min = Math.min( min , root.val-pre.val ) ;
            }
            pre = root ;
            inorder(root.right) ;
        }

    }
}
