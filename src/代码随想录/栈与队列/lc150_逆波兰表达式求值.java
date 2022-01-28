package 代码随想录.栈与队列;

import java.util.Stack;

/**
 * @author pumpkin
 * @date 2022/1/27 0027 下午 15:05
 */
public class lc150_逆波兰表达式求值 {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack() ;
            for( int i = 0 ; i < tokens.length ; i++ ){
                if( stack.empty() ){
                    stack.push( Integer.parseInt(tokens[i]) ) ;
                }
                else if( "+".equals(tokens[i]) ){
                    int b = stack.pop() ;
                    int a = stack.pop() ;
                    stack.push(a+b);
                }
                else if( "-".equals(tokens[i])){
                    int b = stack.pop() ;
                    int a = stack.pop() ;
                    stack.push(a-b);
                }
                else if("*".equals(tokens[i])){
                    int b = stack.pop() ;
                    int a = stack.pop() ;
                    stack.push(a*b);
                }
                else if("/".equals(tokens[i])){
                    int b = stack.pop() ;
                    int a = stack.pop() ;
                    stack.push(a/b);
                }
                else{
                    stack.push(Integer.parseInt(tokens[i])) ;
                }
            }
            return stack.peek() ;
        }
    }
}
