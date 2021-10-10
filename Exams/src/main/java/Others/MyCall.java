package Others;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
class MyCall{

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
//            if (fast == slow) {
//                break;
//            }
        }
        if (fast != slow) {
            return null;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.compute_Entropy("AAAAAABBBB"));
//
//       System.out.println(solution.get_index(new String[]{"1,1","2,2","1,2","1,3"}));


    }
}
