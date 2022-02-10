package 代码随想录.二叉树;

import java.util.Arrays;
import java.util.Spliterator;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 14:54
 */
public class lc654_最大二叉树 {
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return buildTree(nums, 0, nums.length-1) ;
        }
        public TreeNode buildTree( int[] nums, int leftIndex, int rightIndex ){
            if( leftIndex > rightIndex ){
                return null ;
            }
            int maxIndex = -1 ;
            int maxValue = Integer.MIN_VALUE ;
            for( int i = leftIndex ; i <= rightIndex ; i++  ){
                if( nums[i] > maxValue){
                    maxValue = nums[i] ;
                    maxIndex = i ;
                }
            }
            TreeNode root = new TreeNode(maxValue) ;
            root.left = buildTree(nums , leftIndex , maxIndex-1) ;
            root.right = buildTree(nums , maxIndex+1, rightIndex) ;
            return root ;
        }
    }
}
