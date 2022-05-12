package com.dyx.labuladong.basic.d01;

import java.util.List;
import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: duanyixuan3
 * \* Date: 2022/5/12
 * \* Time: 2:52 下午
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 二叉堆：https://labuladong.github.io/algo/2/21/62/
 * 二叉堆：最小堆、最大堆
 * 上浮：swim
 * 下沉：sink
 * 优先级队列
 * \
 */
public class P23MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new P23MergeKSortedLists().new Solution();
        // TO TEST
        ListNode list1 = new ListNode(1);
        list1.add(4);
        list1.add(5);

        ListNode list2 = new ListNode(1);
        list2.add(3);
        list2.add(4);

        ListNode list3 = new ListNode(2);
        list3.add(6);
        ListNode[] lists = {list1, list2, list3};
        ListNode result = solution.mergeKLists(lists);

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
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) return null;

            //虚拟根根节点
            ListNode dummy = new ListNode(-1);
            ListNode p = dummy;

            //优先级队列
            PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));
            for (ListNode head : lists) {
                if (head != null) {
                    pq.add(head);
                }
            }

            while (!pq.isEmpty()) {
                //获取最小节点
                ListNode node = pq.poll();
                p.next = node;

                if (node.next != null) {
                    pq.add(node.next);
                }

                p = p.next;
            }

            return dummy.next;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}