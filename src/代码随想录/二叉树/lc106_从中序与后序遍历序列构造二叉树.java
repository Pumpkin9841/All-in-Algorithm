package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/10 0010 下午 13:44
 */
public class lc106_从中序与后序遍历序列构造二叉树 {

    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            int inL = 0 ;
            int inR = inorder.length - 1 ;
            int posL = 0 ;
            int posR = postorder.length - 1 ;
            return buildTreeHelper( inorder , inL , inR , postorder , posL , posR ) ;
        }

        public TreeNode buildTreeHelper( int[] inorder, int inL, int inR, int[] postorder, int posL, int posR){
            if( inL > inR ){
                return null ;
            }
            //创建根节点
            //后续遍历的最后一个元素为根节点
            TreeNode root = new TreeNode(postorder[posR]) ;

            //找到中序遍历中的根节点的下标
            int k = -1 ;
            for( int i = inL ; i <= inR ; i++){
                if( inorder[i] == postorder[posR] ){
                    k = i ;
                    break ;
                }
            }
            //计算右子树个数
            int rightNum = inR - k ;
            root.left = buildTreeHelper( inorder, inL, k-1, postorder, posL, posR-1-rightNum ) ;
            root.right = buildTreeHelper( inorder, k+1, inR, postorder, posR-rightNum, posR-1 ) ;
            return root ;
        }

    }
}
