package wangbei.leetcode._001;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * <p>你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * <p>示例:
 *
 * <p>给定 nums = [2, 7, 11, 15], target = 9
 *
 * <p>因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 */
public class Solution {

  public int[] twoSum(int[] nums, int target) {
    int len = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; ++i) {
      if (map.containsKey(nums[i])) {
        return new int[]{map.get(nums[i]), i};
      }
      map.put(target - nums[i], i);
    }
    return null;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] result = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
    if (result == null) {
      System.out.println("result is null");
    } else {
      System.out.println("result is [" + result[0] + ", " + result[1] + "]");
    }
  }
}
