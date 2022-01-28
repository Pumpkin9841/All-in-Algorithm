package 代码随想录.栈与队列;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/26 0026 下午 15:26
 */
public class lc20_括号配对 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack() ;
            char[] chars = s.toCharArray() ;
            for( char c : chars ){
                if( stack.empty() ){
                    stack.push(c) ;
                }
                else if( c == ')' && stack.peek() == '(' ){
                    stack.pop() ;
                }
                else if( c == '}' && stack.peek() == '{' ){
                    stack.pop() ;
                }
                else if( c == ']' && stack.peek() == '[' ){
                    stack.pop() ;
                }
                else {
                    stack.push(c) ;
                }
            }

            if( stack.empty() ){
                return true ;
            }
            else {
                return false ;
            }
        }
    }
}
