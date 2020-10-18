package Samples;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode list = head;
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        head=list;
        int steps = k%len;
        System.out.println("k : "+k+" len : "+len);
        System.out.println("steps : "+steps);
        for(int i=1;i<=steps;i++) {
            ListNode el = head;
            while(el.next.next!=null) {
                el = el.next;
            }
            if(el.next.next==null) {
                list = el.next;
                el.next=null;
                list.next = head;
                head = list;
            }
        }
        return list;
    }
}