package lc周赛.lc_274周赛_2022_1_2;

/**
 * @author pumpkin
 * @date 2022/1/2 0002 上午 11:13
 */

import java.util.Arrays;

/**
 * 给你一个整数 mass ，它表示一颗行星的初始质量。再给你一个整数数组 asteroids ，其中 asteroids[i] 是第 i 颗小行星的质量。
 *
 * 你可以按 任意顺序 重新安排小行星的顺序，然后让行星跟它们发生碰撞。如果行星碰撞时的质量 大于等于 小行星的质量，那么小行星被 摧毁 ，并且行星会 获得 这颗小行星的质量。否则，行星将被摧毁。
 *
 * 如果所有小行星 都 能被摧毁，请返回 true ，否则返回 false
 */
public class C_5969_摧毁小行星 {
    class Solution {
        public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            long[] longAsteroids = new long[asteroids.length] ;
            int index = 0 ;
            for( int x : asteroids ){
                longAsteroids[index++] = x ;
            }
            Arrays.sort(longAsteroids) ;
            long longMass = mass ;
            for( long curr : longAsteroids ){
                if( longMass >= curr){
                    longMass += curr ;
                }
            }
            return longMass >= longAsteroids[longAsteroids.length-1] ? true : false ;
        }
    }
}
