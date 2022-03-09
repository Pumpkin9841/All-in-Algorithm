package 手撕;

import 代码随想录.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pumpkin
 * @date 2022/3/7
 */
public class 二叉树按层遍历 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> leverOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>() ;
        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root != null) q.offer(root) ;
        while( q.size() != 0 ){
            int size = q.size() ;
            ArrayList<Integer> levelList = new ArrayList<>();
            for( int i = 0 ; i < size ; i++ ){
                TreeNode top = q.poll() ;
                levelList.add(top.getVal()) ;
                if( top.getLeft() != null ){
                    q.offer(top.getLeft()) ;
                }
                if( top.getRight() != null ){
                    q.offer(top.getRight()) ;
                }
            }
            list.add(levelList) ;
        }
        return list ;
    }
}
