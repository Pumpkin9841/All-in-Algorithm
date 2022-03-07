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
        sort(array , 0 , len-1) ;
       System.out.println(Arrays.toString(array));
   }
   public static void sort( int[] array , int left , int right){
        if( left > right ){
            return;
        }
        int base = array[left] ;
        int i = left , j = right ;
        while( i != j ){
            while( array[j] >= base && i < j ){
                j-- ;
            }

            while( array[i] <= base && i < j ){
                i++ ;
            }
        }
        if( i < j ){
            int temp = array[i] ;
            array[i] = array[j] ;
            array[j] = temp ;
        }
        array[left] = array[i] ;
        array[i] = base ;
        sort(array , left , i-1);
        sort(array , i+1 , right);
   }
}
