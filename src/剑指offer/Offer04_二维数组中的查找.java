package 剑指offer;

/**
 * @author pumpkin
 * @date 2022/3/13
 */
public class Offer04_二维数组中的查找 {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if( matrix == null || matrix.length == 0 || matrix[0].length == 0 ){
                return false ;
            }
            int colomuns = matrix[0].length-1 ;
            int rows = matrix.length-1 ;
            int row = 0 ;
            int colomun = colomuns ;
            while( row <= rows && colomun >= 0 ){
                if( matrix[row][colomun] == target ){
                    return true ;
                }
                else if( matrix[row][colomun] < target ){
                    row++ ;
                }
                else{
                    colomun-- ;
                }
            }
            return false ;
        }
    }
}
