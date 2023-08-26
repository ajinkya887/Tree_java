package com.company;

public class Main {
    static class Node {
        int item;
        Node left, right;
        public Node (int key){
            item = key;
            left = right = null;
        }
    }
    static class BinaryTree{
        Node root;
        BinaryTree(){
            root = null;
        }
    }

    static void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.item + "->");
        }
    }

    static void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.item + "->");
            inorder(node.right);
        }
    }
    static void preorder(Node node){
        if(node != null){
            System.out.print(node.item + "->");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        System.out.println("Inorder Traversal");
        inorder(tree.root);
        System.out.println("Postorder Traversal");
        postorder(tree.root);
        System.out.println("Preorder Traversal");
        preorder(tree.root);
    }
}
