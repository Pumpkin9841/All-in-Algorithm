package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/2/15 0015 下午 16:15
 */
public class lc17_电话号码的字母组合 {
    class Solution {
        List<String> ans = new ArrayList() ;
        StringBuilder path = new StringBuilder() ;
        public List<String> letterCombinations(String digits) {
            if( digits == "" || digits.length() == 0 ){
                return ans ;
            }

            String[] numMap  = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"} ;

            backtrack(digits ,  0 , numMap) ;
            return ans ;
        }

        public void backtrack( String digits, int index ,String[] numMap ){
            if( index == digits.length()  ){
                ans.add(path.toString()) ;
                return ;
            }
            int numIndex = digits.charAt(index) - '0';
            String letter = numMap[numIndex] ;
            for( int i = 0 ; i < letter.length() ; i++ ){
                path.append(letter.charAt(i)) ;
                backtrack(digits , index+1 ,numMap);
                path.deleteCharAt(path.length()-1) ;
            }
        }
    }
}
