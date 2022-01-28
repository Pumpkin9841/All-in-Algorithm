package 代码随想录.数组;

import java.util.HashMap;

/**
 * @author pumpkin
 * @date 2022/1/1 0001 下午 12:27
 */
public class lc904_水果成篮 {
    public int totalFruit(int[] fruits) {
        int res = 0;
        int subLength = 0 ; //滑动窗口的长度
        int i = 0 ; //滑动窗口的起始位置
        Counter counter = new Counter() ;
        for( int j = 0 ; j < fruits.length ; j++ ){
            counter.add(fruits[j] , 1) ;
            while( counter.size() >= 3 ){
                counter.add(fruits[i] , -1) ;
                if( counter.get(fruits[i]) == 0 ){
                    counter.remove(fruits[i]) ;
                }
                i++ ;
            }
            res = res > (j-i+1) ? res : (j-i+1) ;
        }
        return res ;
    }
}

class Counter extends HashMap<Integer , Integer>{
    public Integer get( Integer key){
        return containsKey(key) ? super.get(key) : 0;
    }

    public void add( Integer key , Integer value ){
        put(key , get(key) + value) ;
    }
}