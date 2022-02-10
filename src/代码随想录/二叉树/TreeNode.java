package 代码随想录.二叉树;

/**
 * @author pumpkin
 * @date 2022/1/28 0028 下午 16:28
 */
public class TreeNode {
    int val ;
    TreeNode left ;
    TreeNode right ;
    public TreeNode(){

    }

    public TreeNode(int val){
        this.val = val ;
    }

    public TreeNode(int val , TreeNode left , TreeNode right){
        this.val = val ;
        this.left = left ;
        this.right = right ;
    }
}
