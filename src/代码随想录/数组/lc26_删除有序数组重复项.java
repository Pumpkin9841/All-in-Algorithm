package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/20 0020 下午 22:34
 */
public class lc26_删除有序数组重复项 {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0 ;
        for( int fastIndex = 1 ; fastIndex < nums.length ; fastIndex++ ){
            //若慢指针与快指针指示的元素不同，则将slowIndex后面的元素赋值为fastIndex指示的元素
            if( nums[slowIndex] != nums[fastIndex] ){
                nums[++slowIndex] = nums[fastIndex] ;
            }
        }
        return slowIndex+1 ;
    }
}
