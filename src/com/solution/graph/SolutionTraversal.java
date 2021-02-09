package com.solution.graph;


import java.util.ArrayDeque;
import java.util.Scanner;

class Nodes{
    Node left,right;
    int data;
    Nodes(int data){
        this.data=data;
        left=right=null;
    }
}
class SolutionTraversal {

    static void levelOrder(Node root){
        //Write your code here
        if (root == null) {
            return;
        }
        ArrayDeque<Node> deque = new ArrayDeque(); // use deque as a queue
        deque.add(root);
        while (!deque.isEmpty()) {
            Node n = deque.removeFirst();
            System.out.print(n.data + " ");
            if (n.left != null) {
                deque.addLast(n.left);
            }
            if (n.right != null) {
                deque.addLast(n.right);
            }
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}



