package com.hmd.reverse;

import com.hmd.ListNode;
import com.hmd.SingleLinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class ReverseSingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();

    @Before
    public void setUp() throws Exception {
        for (int i = 1; i < 50; i++) {
            list.addNode(i);
        }
        list.printList();
    }

    @Test
    public void reverse() {
        long start = System.currentTimeMillis();
        ListNode reverse = ReverseSingleLinkedList.reverse(list.head);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
        SingleLinkedList.printList(reverse);
    }

    @Test
    public void reverseLoop() {
        long start = System.currentTimeMillis();
        ListNode reverse = ReverseSingleLinkedList.reverseLoop(list.head);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
        SingleLinkedList.printList(reverse);
    }

}