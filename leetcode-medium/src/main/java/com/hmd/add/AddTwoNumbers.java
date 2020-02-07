package com.hmd.add;

import com.hmd.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode first = l1, second = l2, curr = dummyHead;
        int carry = 0;
        while (first != null || second != null) {
            int x = first != null ? first.data : 0;
            int y = second != null ? second.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
