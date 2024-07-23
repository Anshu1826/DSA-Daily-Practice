package com.anshika.dailyProgress._23July24;


public class swapNodeInPairs {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void print(Node head) {
            Node curr = head;
            while(curr  != null) {
                System.out.print(curr.data + "\t");
                curr = curr.next;
            }
        }
    }
    public Node head;
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        Node head = node;
        head.print(head);
        System.out.println();
        if(head == null || head.next == null)
            return ;
        head.print(reverse(head));

    }
    public static Node reverse(Node head) {
        if(head == null || head.next == null)
            return head;
        Node temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        head = temp;
        head.next.next = reverse(head.next.next);
        return head;
    }
}
