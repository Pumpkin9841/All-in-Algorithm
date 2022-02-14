package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/14 0014 下午 13:47
 */
public class lc108_将有序数组转换为二叉搜索树 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sortedArrayToBST(nums , 0 , nums.length ) ;
        }
        public TreeNode sortedArrayToBST(int[] nums , int left , int right){
            if( left >= right ){
                return null ;
            }
            if( right - left == 0){
                return new TreeNode(nums[left]) ;
            }
            int mid = left + (right - left)/2 ;
            TreeNode root = new TreeNode(nums[mid]) ;
            root.left = sortedArrayToBST(nums , left , mid) ;
            root.right = sortedArrayToBST(nums, mid+1 , right) ;
            return root ;
        }
    }
}
