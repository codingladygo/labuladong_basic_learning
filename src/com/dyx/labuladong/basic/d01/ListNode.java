package com.dyx.labuladong.basic.d01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: duanyixuan3
 * \* Date: 2022/5/12
 * \* Time: 1:56 下午
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if (this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

    // 打印链表
    public void print() {
        System.out.print(this.val);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }

}