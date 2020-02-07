package com.hmd.reverse;

import org.junit.Test;

/**
 * @author: <a href="mailto:nonamelnl@126.com">NoNamelnl</a>
 * @version: 1.0
 * @create: 2018/8/13
 */
public class IntReverseTest {

    @Test
    public void reverse() {
        int x = 34567;
        int reverse = IntReverse.reverse(x);
        System.out.println(reverse);
    }
}