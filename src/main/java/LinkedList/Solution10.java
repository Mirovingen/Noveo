package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
// Time complexity O(N)
// Space complexity O(1)
public class Solution10 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwo(l1,l2,0);

    }

    public ListNode addTwo(ListNode l1, ListNode l2, int add){

        l1.val += l2.val + add;
        add=0;
        if (l1.val >= 10){
            add = 1;
            l1.val -= 10;
        }
        if (l1.next != null && l2.next != null) {
            addTwo(l1.next,l2.next, add);
        }else if(l1.next == null && l2.next != null){
            l1.next = addTwo(new ListNode(0),l2.next, add);
        }else if(l1.next != null && l2.next == null){
            addTwo(l1.next,new ListNode(0), add);
        }else{
            if (add > 0){
                l1.next = new ListNode(add);
            }
        }

        return l1;
    }
}
