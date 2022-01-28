package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/17 0017 下午 21:38
 */
public class lc69_sqrtX {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        if( x == 0 ){
            return 0 ;
        }
        if( x == 1 ){
            return 1 ;
        }
        int left = 1 ;
        int right = x ;
        int ans = x ;
        while( left <= right ){
            int mid =  left + ( (right - left) / 2) ;
            if( mid >= (x / mid) ){
                ans = mid ;
                right = mid - 1 ;
            }
            else if( mid*mid < x ){
                left = mid + 1 ;
            }
        }
        if( ans > x / ans ){
            return ans-1 ;
        }
        else{
            return ans ;
        }
    }
}
