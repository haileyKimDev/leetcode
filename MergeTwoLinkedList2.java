class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoLinkedList2 {
    public static ListNode mergeTwoLists(ListNode l1,
                                         ListNode l2)
    {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current_node.next =l1;
                l1 = l1.next;
            }else {
                current_node.next = l2;
                l2 = l2.next;
            }

            current_node = current_node.next;
        }

        if(l1 != null){
            current_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current_node.next = l2;
            l2 = l2.next;
        }

        return temp_node.next;
    }

    // A utility function to print linked list
    static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        // 1->3->5 LinkedList created
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);

        // 0->2->4 LinkedList created
        ListNode mergedhead = mergeTwoLists(head1, head2);

        printList(mergedhead);
    }
}

