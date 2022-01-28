package 代码随想录.哈希;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/1/16 0016 下午 15:07
 */
public class lc15_三数之和 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    return result;
                }

                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;
                while (right > left) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;

                        right--;
                        left++;
                    }
                }
            }
            return result;
        }
    }
}
