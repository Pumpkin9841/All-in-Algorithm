package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/3
 */
public class Test {
    public static void main(String[] args) {
        Test.quickSort(new int[]{3,1,2,7,7567});
    }

    public static void quickSort( int[] array ){
        int len ;
        if( array == null
                || (len = array.length) == 0
                || len == 1 ){
            return ;
        }
        sort(array , 0 , len-1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort( int[] array , int left , int right ){
        if( left > right ){
            return ;
        }
        //选一个基准数
        int base = array[left] ;
        int i = left , j = right ;
        while( i != j ){
            //从右边 找到比基准数小的数
            while( array[j] >= base && i < j ){
                j-- ;
            }

            while( array[i] <= base && i < j ){
                i++ ;
            }
        }
        if( i < j ){
            int temp = array[j] ;
            array[j] = array[i] ;
            array[i] = temp ;
        }
        array[left] = array[i] ;
        array[i] = base ;
        sort(array , 0 , i-1);
        sort(array , i+1 , right);
    }
}
