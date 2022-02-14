package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/14 0014 下午 13:00
 */
public class lc669_修剪二叉搜索树 {
    /**
     * 遍历出不在区间[low,high]的节点，从二叉搜索树删除这些节点
     */
    class Solution {
        List<Integer> list = new ArrayList() ;
        public TreeNode trimBST(TreeNode root, int low, int high) {
            inorder(root) ;
            for( int i : list ){
                if( i < low || i > high ){
                    root = deleteTree(root,i) ;
                }
            }
            return root ;
        }

        //删除BST中的节点
        public TreeNode deleteTree(TreeNode root , int key){
            //第一种情况：如果没有找到删除节点，直接返回
            if( root == null ){
                return root ;
            }
            //找到要删除的节点，又分为4种情况
            if( root.val == key ){
                //第二种情况：要删除的节点是叶子节点 直接删除
                if( root.left == null && root.right == null ){
                    root = null ;
                    return root ;
                }
                //第三种情况：要删除的节点的左孩子为空，右孩子不为空，用右孩子补位
                else if( root.left == null ){
                    return root.right ;
                }
                //第四种情况：要删除的节点的右孩子为空，左孩子不为空，用左孩子补位
                else if( root.right == null ){
                    return root.left ;
                }
                //第五种情况：要删除的节点的左右孩子都不为空
                else{
                    TreeNode temp = root.right ;
                    while( temp.left != null ){
                        temp = temp.left ;
                    }
                    temp.left = root.left ;
                    return root.right ;
                }
            }
            else if( root.val > key ){
                root.left = deleteTree(root.left , key) ;
            }
            else if( root.val < key ){
                root.right = deleteTree(root.right , key) ;
            }
            return root ;
        }
        public void inorder( TreeNode root ){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            list.add(root.val) ;
            inorder(root.right) ;
        }
    }

    /**
     代码随想录中的方法
     */
    class Solution1 {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if( root == null){
                return root ;
            }
            if( root.val > high ){
                return trimBST(root.left , low , high) ; // 寻找符合区间[low, high]的节点
            }

            if( root.val < low ){
                return trimBST(root.right , low ,high) ; // 寻找符合区间[low, high]的节点
            }
            root.left = trimBST(root.left , low ,high) ; // root.left接入符合条件的左孩子
            root.right = trimBST(root.right , low ,high) ; // root.right接入符合条件的右孩子
            return root ;
        }
    }
}
