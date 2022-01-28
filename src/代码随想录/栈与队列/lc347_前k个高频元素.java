package 代码随想录.栈与队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author pumpkin
 * @date 2022/1/27 0027 下午 16:28
 */
public class lc347_前k个高频元素 {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer ,Integer> map = new HashMap() ;
            for( int i = 0 ; i < nums.length ; i++ ){
                map.put( nums[i] , map.getOrDefault(nums[i],0)+1) ;
            }
            PriorityQueue<int[]> pq = new PriorityQueue<>( (o1, o2)->o2[1]-o1[1] ) ;
            for( int key : map.keySet() ){
                int frequence = map.get(key) ;
                int[] temp = new int[]{key , frequence} ;
                pq.offer(temp) ;
            }
            int[] ret = new int[k] ;
            for( int i = 0 ; i < k ; i++ ){
                ret[i] = pq.poll()[0] ;
            }
            return ret ;
        }
    }
}
