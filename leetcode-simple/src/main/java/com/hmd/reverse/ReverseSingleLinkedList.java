package com.hmd.reverse;

import com.hmd.ListNode;

/**
 * 反转一个单链表。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class ReverseSingleLinkedList {

    /**
     * 反转单向链表--递归方式
     *
     * @param node
     * @return
     */
    public static ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reverse = reverse(node.next);
        // Node temp = node.next;
        node.next.next = node;
        node.next = null;
        return reverse;
    }

    /**
     * 反转单向链表--循环方式
     *
     * @param node
     * @return
     */
    public static ListNode reverseLoop(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
