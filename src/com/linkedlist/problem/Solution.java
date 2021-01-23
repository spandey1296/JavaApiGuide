package com.linkedlist.problem;



import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();

          //  llist.head = insertNodeAtHead(llist.head, llistItem);

            llist.head = insertNodeAtTail(llist.head, llistItem);


        }

      printLinkedList(llist.head);
    }

    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {


        SinglyLinkedListNode newNode= new SinglyLinkedListNode(data);
        if(llist==null) return newNode;

        SinglyLinkedListNode temp=llist;
        llist= newNode;
        llist.next=temp;
        return llist;
    }


    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {



        SinglyLinkedListNode newNode= new SinglyLinkedListNode(data);
        if(head==null){
            head=newNode;
            return head;

        }
        SinglyLinkedListNode curr_node=head;
        while(curr_node.next!=null){
            curr_node=curr_node.next;

        }
        curr_node.next=newNode;
        return head;

    }














}
class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }
}