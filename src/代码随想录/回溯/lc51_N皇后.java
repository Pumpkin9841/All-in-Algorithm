package 代码随想录.回溯;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/2/23
 */
public class lc51_N皇后 {
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans = new ArrayList() ;
            Set<Integer> columns = new HashSet() ;
            Set<Integer> dialog1 = new HashSet() ;
            Set<Integer> dialog2 = new HashSet() ;
            int[] queues = new int[n] ;
            Arrays.fill(queues,-1) ;
            backtrack(n , queues, 0, columns, dialog1, dialog2, ans);
            return ans ;
        }

        public void backtrack(int n , int[] queues, int row, Set<Integer> columns, Set<Integer> dialog1, Set<Integer> dialog2, List<List<String>> ans) {
            if( row == n ){
                ans.add(generate(queues, n)) ;
            }
            else{
                for( int i = 0 ; i < n ; i++ ){
                    if( columns.contains(i) ){
                        continue ;
                    }
                    if( dialog1.contains(row+i) ){
                        continue ;
                    }

                    if( dialog2.contains(row-i) ){
                        continue ;
                    }

                    columns.add(i) ;
                    dialog1.add(row+i) ;
                    dialog2.add(row-i) ;
                    queues[row] = i ;
                    backtrack(n ,queues, row+1, columns, dialog1, dialog2, ans) ;
                    columns.remove(i) ;
                    dialog1.remove(row+i) ;
                    dialog2.remove(row-i) ;
                    queues[row] = -1 ;
                }
            }
        }

        public List<String> generate( int[] queues, int n ){
            List<String> borad = new ArrayList() ;
            for( int i = 0 ; i < n ; i++ ){
                char[] temp = new char[n] ;
                Arrays.fill(temp , '.') ;
                temp[queues[i]] = 'Q' ;
                borad.add(String.valueOf(temp)) ;
            }
            return borad ;

        }
    }
}
