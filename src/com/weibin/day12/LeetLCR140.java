package com.weibin.day12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author april
 * @date 2023-10-11
 * @description
 */
public class LeetLCR140 {

    public static void main(String[] args) {
        ListNode node8 = new ListNode(8);
        ListNode node7 = new ListNode(7, node8);
        ListNode node4 = new ListNode(4, node7);
        ListNode node2 = new ListNode(2, node4);
        trainingPlan(node2, 1);
    }

    public static ListNode trainingPlan(ListNode head, int cnt) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() + 1 - cnt);
    }


}
 class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
