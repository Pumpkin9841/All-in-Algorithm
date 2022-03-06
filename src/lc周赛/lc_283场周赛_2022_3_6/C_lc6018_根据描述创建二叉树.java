package lc周赛.lc_283场周赛_2022_3_6;

import 代码随想录.二叉树.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/3/6
 */
public class C_lc6018_根据描述创建二叉树 {
    /**
     * 建树加找根
     */
    class Solution {
        public TreeNode createBinaryTree(int[][] descriptions) {

            Map<Integer,Integer> parent = new HashMap() ; //父节点值，下标
            Map<Integer,Integer> child = new HashMap() ;
            for( int i = 0 ; i < descriptions.length ; i++ ){
                parent.put(descriptions[i][0] , i) ;
                child.put(descriptions[i][1] , i) ;
            }
            int parentNode = -1 ;
            for( int parentKey : parent.keySet() ){
                if( child.containsKey(parentKey) ){
                    continue ;
                }
                else{
                    parentNode = parentKey ;
                    break ;
                }
            }
            //System.out.println(parentNode) ;

            Map<Integer,TreeNode> map = new HashMap() ;
            for( int[] curr : descriptions ){
                TreeNode parents = map.get(curr[0]) ;
                TreeNode childs = map.get(curr[1]) ;
                if( map.get(curr[0]) == null ){
                    parents = new TreeNode(curr[0]) ;
                    map.put(curr[0] , parents) ;
                }
                if( map.get(curr[1]) == null){
                    childs = new TreeNode(curr[1]) ;
                    map.put(curr[1] , childs) ;
                }
                if( curr[2] == 1 ){
                //    parents.left = childs ;
                }
                else if( curr[2] == 0 ){
                 //   parents.right = childs ;
                }
            }

            return map.get(parentNode) ;

        }
    }
}
