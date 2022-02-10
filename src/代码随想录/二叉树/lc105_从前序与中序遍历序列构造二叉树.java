package 代码随想录.二叉树;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 13:47
 */
public class lc105_从前序与中序遍历序列构造二叉树 {
    class Solution {
        public TreeNode create( int[] preorder , int preL , int preR , int[] inorder , int inL, int inR ){
            if( preL > preR ){
                //先序序列区间长度小于0 ，直接返回
                return null;
            }

            TreeNode root = new TreeNode(preorder[preL]) ; //创建根节点
            int k = 0;
            //找到中序序列中的根节点
            for( int i = inL ; i <= inR ; i++ ){
                if( inorder[i] == root.val ){
                    k = i ;
                    break ;
                }
            }
            int leftNum = k - inL ; //左子树节点数
            root.left = create( preorder , preL+1 , preL+leftNum , inorder, inL , k-1 ) ;
            root.right = create( preorder , preL+leftNum+1 , preR , inorder , k+1 , inR ) ;
            return root ;

        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int preL = 0 ;
            int preR = preorder.length-1 ;
            int inL = 0 ;
            int inR = inorder.length-1 ;
            return create( preorder , preL , preR , inorder , inL , inR ) ;
        }
    }


}
