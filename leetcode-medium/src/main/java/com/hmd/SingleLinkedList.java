package com.hmd;

import com.hmd.ListNode;

/**
 *
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class SingleLinkedList {

    /**
     * 头节点
     */
    public ListNode head = null;

    /**
     * 尾部添加节点
     *
     * @param d
     */
    public void addNode(int d) {
        ListNode newNode = new ListNode(d);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * 打印单向链表
     */
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    /**
     * 打印单向链表
     *
     * @param head
     */
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    /**
     * 反转单向链表--递归方式
     *
     * @param node
     * @return
     */
    public ListNode reverse(ListNode node) {
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
    public ListNode reverseLoop(ListNode node) {
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