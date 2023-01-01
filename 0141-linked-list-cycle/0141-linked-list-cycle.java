/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet();
            while (head != null) { //while head is not null
                if (!set.add(head)) { 
                    //if the set contains head already, set.add() method returns false,
                    //so the set has contains 'head' already
                    return true;
                }
                head = head.next; //link next 
            }
            return false; // when head is null
        }
    }
