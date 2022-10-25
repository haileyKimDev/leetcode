/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //To Check if Linked list is empty
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        //Head LinkedList
        ListNode head;

        //Temp LinkedList, which will used to fill result data
        ListNode temp;

        //To get Linked list in ascending order, fill head of temp Linked list
        if (list1.val > list2.val) {
            //the smaller(list2.val) will be appended to head and temp linked list
            temp = head = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            temp = head = new ListNode(list1.val);
            list1 = list1.next;
        }

        //To reach to tail of both linked list
        while (list1 != null || list2 != null) {
            if (list1 == null && list2 != null) { //when list1 is end, list2 has some value,
                temp.next = new ListNode(list2.val); //append list2's current value to temp.next
                list2 = list2.next; // if list2 doesn't have anything, it would be null
            } else if (list1 != null && list2 == null) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val > list2.val) {
                    temp.next = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    temp.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}