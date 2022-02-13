package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/2/13 0013 下午 14:08
 */
public class lc450_删除二叉搜索树中的节点 {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            //第1种情况，没有找到要删除的节点，遍历到空节点，直接返回
            if( root == null ){
                return root ;
            }
            //找到要删除的节点，又分为4种情况
            if( root.val == key ){
                //第2种情况，要删除的节点为叶子节点 ，直接删除
                if( root.left == null && root.right == null ){
                    root = null ; //将root置为null
                    return root ;
                }
                //第3种情况，要删除的节点的左孩子为空，右孩子不为空，删除节点，右孩子补位，返回右孩子的根节点
                else if( root.left == null ){
                    root = root.right ;
                    return root ;
                }
                //第4种情况，要删除的节点的右孩子为空，左孩子不为空，删除节点，左孩子补位，返回左孩子的根节点
                else if( root.right == null ){
                    root = root.left ;
                    return root ;
                }
                //第5种情况，要删除的节点的左右孩子都不为空，
                //则将删除节点的左子树头结点（左孩子）放到删除节点的右子树的最左面节点的左孩子上，返回删除节点右孩子为新的根节点
                else{
                    TreeNode next = root.right ;
                    while( next.left != null ){
                        next = next.left ;   //找到删除节点的右子树的最左面节点的左孩子
                    }
                    next.left = root.left ;
                    return root.right ;
                }
            }
            else if( root.val > key ){
                root.left = deleteNode(root.left , key) ;
            }
            else if( root.val < key ){
                root.right = deleteNode(root.right , key) ;
            }
            return root ;
        }
    }
}
