package lc周赛.lc_283场周赛_2022_3_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/6
 */
public class A_lc6016_Excel表中某个范围内的单元格 {
    class Solution {
        public List<String> cellsInRange(String s) {
            char[] chars = s.toCharArray() ;
            char col1 = chars[0] ;
            char col2 = chars[3] ;
            char row1 = chars[1] ;
            char row2 = chars[4] ;
            List<String> list = new ArrayList() ;
            for( char i = col1 ; i <= col2 ; i++ ){
                for( char j = row1 ; j <= row2 ; j++ ){
                    list.add(String.valueOf(i) + String.valueOf(j)) ;
                }
            }
            return list ;

        }
    }
}
