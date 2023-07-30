package Algo.Tree;

import java.util.Scanner;

public class BuildTree {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = null;
        root = new BuildTree().buildTree();
    }

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node buildTree() {
        System.out.println("enter data");
        int data = sc.nextInt();
        // base case
        if (data == -1) {
            return null;
        }
        // total three steps
        // 1. create a new node
        //2. let recursion build the left part of tree
        // 3. let recursion build the right part of tree
        Node node = new Node(data);
        System.out.println("data for left tree " + data);
        node.left = buildTree();
        System.out.println("data for right tree " + data);
        node.right = buildTree();
        return node;
    }
}
