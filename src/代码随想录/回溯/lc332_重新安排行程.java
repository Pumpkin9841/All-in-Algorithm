package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author pumpkin
 * @date 2022/2/23
 */
public class lc332_重新安排行程 {
    public static void main(String[] args) {
        PriorityQueue<List<String>> queue = new PriorityQueue<>((o1,o2)->{
            for( int i = 0 ; i < o1.size() ; i++ ){
                if( o1.get(i).compareTo(o2.get(i)) > 0 ){
                    return 1 ;
                }
                else if( o1.get(i).compareTo(o2.get(i)) < 0  ){
                    return -1 ;
                }
                else{
                    return 0 ;
                }
            }
            return 0 ;
        });
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("AFC") ;
        list.add("ABC") ;
        list1.add("BDE") ;
        list1.add("CDE") ;
        queue.offer(list);
        queue.offer(list1);
        for( List<String> list2 : queue ){
            System.out.println(list2);
        }
    }
}
