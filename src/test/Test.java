package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/3
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = getPer(456123);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

    public static List<Integer> getPer( int num ){
        ArrayList<Integer> list = new ArrayList<>();
        while( num > 0 ){
            list.add(num % 10) ;
            num /= 10 ;
        }
        return list ;
    }
}
