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
    public static ListNode mergeTwoLists(ListNode list1,
                                         ListNode list2)
    {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode result = new ListNode();
        ListNode temp = result;

        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            }
            else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }

        if(list1 == null) {temp.next = list2;}
        else {temp.next = list1;}

        return result;
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

