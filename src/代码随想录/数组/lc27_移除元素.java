package 代码随想录.数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 周凡
 * @date 2021/12/20 0020 下午 22:34
 */
public class lc27_移除元素 {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0 ;
        for( int fastIndex = 0 ; fastIndex < nums.length ; fastIndex++ ){
            if( nums[fastIndex] != val ){
                nums[slowIndex++] = nums[fastIndex] ;
            }
        }
        return slowIndex ;
    }

    public static void main(String[] args) {
        Map<String, String> errorMessage = new HashMap<>();
        errorMessage.put("budgetAmount" , "含税信息不能为空") ;
        errorMessage.put("budgetAmount2" , "含税信息不能为空2") ;
        errorMessage.put("budgetAmount3" , "含税信息不能为空3") ;
        ArrayList<String> arrayList = new ArrayList<>();
        String message ;
        for( String item : arrayList ){
            if( item == null ){
                message = errorMessage.get(item) ;  
            }
        }
    }
}
