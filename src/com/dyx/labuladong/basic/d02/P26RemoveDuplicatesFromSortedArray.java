package com.dyx.labuladong.basic.d02;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: duanyixuan3
 * \* Date: 2022/5/13
 * \* Time: 9:53 下午
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class P26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3};
        int result = new P26RemoveDuplicatesFromSortedArray.Solution().removeDuplicates(input);
        System.out.println(result);

    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int slow = 0, fast = 0;
            while (fast < nums.length) {
                if (nums[fast] != nums[slow]) {
                    slow++;
                    nums[slow] = nums[fast];
                }

                fast++;
            }
            return slow + 1;

        }
    }
}