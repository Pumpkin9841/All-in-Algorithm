package 代码随想录.哈希;

/**
 * @author pumpkin
 * @date 2022/1/14 0014 下午 15:13
 */
public class lc383_赎金信 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] record = new int[26] ;
            for( int i = 0 ; i < magazine.length() ; i++ ){
                record[magazine.charAt(i) - 'a'] ++ ;
            }

            for( int i = 0 ; i < ransomNote.length() ; i++ ){
                record[ransomNote.charAt(i) - 'a'] -- ;
            }
            for( int i : record ){
                if( i < 0 ){
                    return false ;
                }
            }
            return true ;
        }
    }
}
