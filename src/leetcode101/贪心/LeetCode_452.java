package leetcode101.贪心;

import java.lang.reflect.Array;
import java.util.*;

public class LeetCode_452 {
    public static void main(String[] args) {
        LeetCode_452 code_452 = new LeetCode_452();
        int minArrowShots = code_452.findMinArrowShots(new int[][]{{1, 4}, {2, 3}});
        System.out.println(minArrowShots);

    }

    public int findMinArrowShots(int[][] points){
        List<int[]> list = Arrays.asList(points);
        //按每个区间的end升序排序
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if( o1[1] > o2[1] ){
                    return 1 ;
                }
                else if( o1[1] < o2[1] ){
                    return -1 ;
                }
                else{
                    return 0 ;
                }
            }
        });
        int count = 1 ;
        //记录当前第一个不能跟前面的的气球被一箭戳破的气球下标
        int index = 0 ;
        for (int i = 1; i < list.size(); i++) {
            int[] curr = list.get(i);
            for (int j = index; j < i ; j++) {
                int[] pre = list.get(j);
                if( curr[0] <= pre[1]){
                    continue;
                }
                else{
                    index = i ;
                    count++;
                    break;
                }
            }
        }
        return count ;
    }
}
