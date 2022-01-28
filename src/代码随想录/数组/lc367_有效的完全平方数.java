package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/17 0017 下午 21:40
 */
public class lc367_有效的完全平方数 {
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num / 2;

        long mid;

        while (l < r) {
            mid = (l + r) / 2;
            if (mid * mid == num) return true;
            if (mid * mid > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l*l == num ;
    }
}
