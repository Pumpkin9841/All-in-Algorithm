package 代码随想录.贪心;

import java.util.LinkedList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/1
 */
public class lc763_划分字母区间 {
    public static void main(String[] args) {
        lc763_划分字母区间 ls = new lc763_划分字母区间();
        List<Integer> ababcbacadefegdehijhklij = ls.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(ababcbacadefegdehijhklij);
    }
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new LinkedList<>();
        int[] edge = new int[26];
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }
        int idx = 0;
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx,edge[chars[i] - 'a']);
            if (i == idx) {
                list.add(i - last);
                last = i;
            }
        }
        return list;
    }
}
