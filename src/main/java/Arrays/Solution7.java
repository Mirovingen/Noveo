package Arrays;
// Time complexity O(N*k)
// Space complexity O(1)
public class Solution7{
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0){
                return null;
            }
            ListNode merged = lists[0];
            for (int i = 1; i < lists.length; i++){
                merged = merge2lists(merged, lists[i]);
            }
            return merged;
        }

        ListNode merge2lists(ListNode l1, ListNode l2){
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode head = new ListNode();
            ListNode pointer = head;
            while (l1 != null && l2 != null){
                if (l1.val < l2.val){
                    pointer.next = l1;
                    l1 = l1.next;
                }else{
                    pointer.next = l2;
                    l2 = l2.next;
                }
                pointer = pointer.next;
            }
            if (l1 != null)
                pointer.next = l1;
            else
                pointer.next = l2;

            return head.next;
        }
}

