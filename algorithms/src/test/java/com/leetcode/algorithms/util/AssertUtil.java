package com.leetcode.algorithms.util;

import com.leetcode.algorithms.model.ListNode;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.*;

public class AssertUtil {
    public static  void compareElements(List<? extends Comparable> list1, List<? extends Comparable> list2) {
        if (list1 == null || list2 == null) {
            assertEquals(list1, list2);
        }
        assertEquals(list1.size(), list2.size());

        Collections.sort(list1);
        Collections.sort(list2);
        Iterator iter1 = list1.iterator();
        Iterator iter2 = list2.iterator();
        while(iter1.hasNext() && iter2.hasNext()) {
            assertEquals(iter1.next(), iter2.next());
        }
    }

    public static void compareArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            assertEquals(array1, array2);
        }
        assertEquals(array1.length, array2.length);

        for(int i = 0; i < array1.length; i++) {
            assertEquals(array1[i], array2[i]);
        }
    }

    public static void compareLinkedList(ListNode head1, ListNode head2) {
        ListNode p1 = head1;
        ListNode p2 = head2;

        while(p1 != null && p2 != null) {
            assertEquals(p1.val, p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }

        assertEquals(p1, p2);
    }
}
