package com.dyx.labuladong.basic.d07;

/**
 * User: duanyixuan3
 * Date: 2022/5/18
 * Time: 10:25 下午
 * Description:
 */
//Java：区域和检索 - 数组不可变
public class P303RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArray solution = new P303RangeSumQueryImmutable().new NumArray();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {
        int[] sums;

        public NumArray(int[] nums) {
            int n = nums.length;
            sums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        public NumArray() {

        }

        public int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
//leetcode submit region end(Prohibit modification and deletion)

}