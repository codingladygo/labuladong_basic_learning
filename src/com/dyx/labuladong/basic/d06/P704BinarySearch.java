package com.dyx.labuladong.basic.d06;

/**
 * User: duanyixuan3
 * Date: 2022/5/17
 * Time: 9:04 下午
 * Description:
 */
//Java：二分查找
public class P704BinarySearch {
    public static void main(String[] args) {
        Solution solution = new P704BinarySearch().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                int num = nums[mid];
                if (num == target) {
                    return mid;
                } else if (num > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}