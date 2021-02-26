package com.solution.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;


class MirrorTree {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String[] ip = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-- > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            Tree obj = new Tree();
            Tree g = new Tree();
            g.mirror(root);
            MirrorTree mt = new MirrorTree();
            mt.inOrder(root);
            System.out.println();

        }
    }
}

class Tree
{
    Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node right = invertTree(root.right);
        Node left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
    void mirror(Node node)
    {
        invertTree(node);
    }
}


class Node1{
    int data;
    Node left;
    Node right;
    Node1(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
