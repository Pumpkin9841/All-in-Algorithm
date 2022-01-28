package leetcode101.贪心;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_763 {
    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij" ;
        LeetCode_763 leetCode_763 = new LeetCode_763();
        List<Integer> integers = leetCode_763.partitionLabels(S);
        System.out.println(integers);
    }

    public  List<Integer> partitionLabels(String s) {
        int[] last = new int[26] ;
        List<Integer> ans = new ArrayList() ;
        for( int i = 0 ; i < s.length() ; i++ ){
            last[ s.charAt(i) - 'a' ] = i ;
        }

        int start = 0 ;
        int end = 0 ;
        for( int i = 0 ; i < s.length() ; i++ ){
            end = Math.max( end , last[s.charAt(i) - 'a'] ) ;
            if( i == end ){
                ans.add( end-start+1 ) ;
                start = end+1 ;
            }
        }
        return ans ;
    }
}
