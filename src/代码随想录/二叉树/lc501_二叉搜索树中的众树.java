package 代码随想录.二叉树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/2/12 0012 下午 14:52
 */
public class lc501_二叉搜索树中的众树 {
    //方法一 把这个树都遍历了，用map统计频率，把频率排个序，最后取前面高频的元素的集合
    class Solution {
        Map<Integer, Integer> map = new HashMap() ;
        public int[] findMode(TreeNode root) {
            if( root == null ){
                return new int[]{} ;
            }
            inorder(root) ;
            int maxValue = Integer.MIN_VALUE ;
            for( Integer key : map.keySet() ){
                maxValue = Math.max( maxValue, map.get(key)) ;
            }
            List<Integer> list = new ArrayList() ;
            for( Integer key : map.keySet() ){
                if( map.get(key) == maxValue ){
                    list.add(key) ;
                }
            }
            int[] ans = new int[list.size()] ;
            int index = 0 ;
            for( int i : list ){
                ans[index++] = i ;
            }
            return ans ;
        }
        public void inorder( TreeNode root ){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            map.put( root.val , map.getOrDefault(root.val, 0)+1 ) ;
            inorder(root.right) ;
        }
    }
    //方法二
    //中序遍历-不使用额外空间，利用二叉搜索树特性
    //只需要遍历一遍二叉搜索树，就求出了众数的集合 频率count 大于 maxCount的时候，不仅要更新maxCount，因为结果集之前的元素都失效了
    class Solution1 {
        List<Integer> list ;
        int maxCount ;
        int count ;
        TreeNode pre ;
        public int[] findMode(TreeNode root) {
            list = new ArrayList() ;
            maxCount = 0 ;
            count = 0 ;
            pre = null; ;
            inorder(root) ;
            int[] ans = new int[list.size()] ;
            int index = 0 ;
            for( int i : list ){
                ans[index++] = i ;
            }
            return ans ;
        }

        public void inorder( TreeNode root ){
            if( root == null ){
                return ;
            }
            inorder(root.left) ;
            if( pre == null || pre.val != root.val ){
                count = 1 ;
            }
            else{
                count++ ;
            }
            if( count > maxCount ){
                maxCount = count ;
                list.clear() ;
                list.add(root.val) ;
            }
            else if(count == maxCount){
                list.add(root.val) ;
            }
            pre = root ;

            inorder(root.right) ;
        }

    }
}
