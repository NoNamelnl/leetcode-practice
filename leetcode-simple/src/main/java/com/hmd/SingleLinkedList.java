package com.hmd;

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
}