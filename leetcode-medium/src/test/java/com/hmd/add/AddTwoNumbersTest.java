package com.hmd.add;

import com.hmd.ListNode;
import com.hmd.SingleLinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class AddTwoNumbersTest {

    SingleLinkedList l1 = new SingleLinkedList();
    SingleLinkedList l2 = new SingleLinkedList();

    @Before
    public void setUp() throws Exception {
        for (int i = 1; i < 4; i++) {
            l1.addNode((int) (Math.random() * 10));
        }
        l1.printList();
        for (int i = 1; i < 10; i++) {
            l2.addNode((int) (Math.random() * 10));
        }
        l2.printList();
    }

    @Test
    public void addTwoNumbers() {
        ListNode addTwoNumbers = AddTwoNumbers.addTwoNumbers(l1.head, l2.head);
        SingleLinkedList.printList(addTwoNumbers);
    }
}