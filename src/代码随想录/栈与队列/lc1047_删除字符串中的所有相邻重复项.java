package 代码随想录.栈与队列;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/27 0027 下午 13:39
 */
public class lc1047_删除字符串中的所有相邻重复项 {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack() ;
            for( int i = 0 ; i < s.length() ; i++ ){
                char curr = s.charAt(i) ;
                if( stack.empty() ){
                    stack.push(curr) ;
                }
                else if( stack.peek() == curr ){
                    stack.pop() ;
                }
                else {
                    stack.push(curr) ;
                }
            }
            StringBuilder sb = new StringBuilder() ;
            while( !stack.empty() ){
                sb.append(stack.pop()) ;
            }
            return sb.reverse().toString() ;
        }
    }
}
