package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/20 0020 下午 22:35
 */
public class lc844_比较含退格的字符串 {
    public boolean backspaceCompare(String s, String t) {
        int backNumsS = 0 ;
        int backNumsT = 0 ;
        int i = s.length()-1 ;
        int j = t.length()-1 ;
        while( i >= 0 || j >= 0 ){
            while( i >= 0 ){
                if( s.charAt(i) == '#' ){
                    i-- ;
                    backNumsS++ ;
                }
                else if( backNumsS > 0 ){
                    backNumsS-- ;
                    i-- ;
                }
                else {
                    break ;
                }
            }
            while( j >= 0 ){
                if( t.charAt(j) == '#' ){
                    j-- ;
                    backNumsT++ ;
                }
                else if( backNumsT > 0 ){
                    backNumsT-- ;
                    j-- ;
                }
                else{
                    break ;
                }
            }
            if( i >= 0 && j >= 0 ){
                if( s.charAt(i) != t.charAt(j) ){
                    return false ;
                }
            }
            else {
                if( i >= 0 || j >= 0 ){
                    return false ;
                }
            }
            i-- ;
            j-- ;
        }
        return true ;
    }
}
