package com.dyx.labuladong.basic.d01;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: duanyixuan3
 * \* Date: 2022/5/12
 * \* Time: 1:54 下午
 * \* Description:
 * \
 */
//Java：合并两个有序链表
public class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new P21MergeTwoSortedLists().new Solution();
        // TO TEST
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        list1.add(2);
        list1.add(4);

        list2.add(3);
        list2.add(4);

        ListNode result = solution.mergeTwoLists(list1, list2);
        result.print();


    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1), p = dummy;
            ListNode p1 = list1;
            ListNode p2 = list2;


            while (p1 != null && p2 != null) {
                if (p1.val < p2.val) {
                    p.next = p1;
                    p1 = p1.next;
                } else {
                    p.next = p2;
                    p2 = p2.next;
                }

                p = p.next;
            }


            if (p1 != null) {
                p = p1.next;
            }
            if (p2 != null) {
                p = p2.next;
            }

            return dummy.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}