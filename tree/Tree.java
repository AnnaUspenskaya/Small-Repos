package tree;

import java.util.Stack;

public class Tree {
    
    private Node root;//holds all the nodes of the binary tree  
//implemening Binary Tree

    public void createBinaryTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        
    }
//Preorder traversal
    // 3 steps applied to each node
    // -> visit root
    // -> visit left subtree 
    // -> visit right subtree 

//Recursive preOrder traversal 
    public void preOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.value + " ");
        //if the root.left is null we exit this call and go to the right subtree
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    //Iterative preorder traversal 
    public void preOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.value + " ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
        
    }
    //In order traversal
    // 3 steps applied to each node
    // -> traverse the left subtree 
    // -> visit the root node  
    // -> traverse the right subtree 
    
    public void inOrderRecursive(Node root) {
        if (root == null) {//base case
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.value + " ");
        inOrderRecursive(root.right);
    }
    
    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.createBinaryTree();
        
        System.out.print("Preorder traversal (Iterative): ");
        bt.preOrderIterative(bt.root);
        System.out.print("\nPreorder traversal (Recursive): ");
        bt.preOrderRecursive(bt.root);
        System.out.print("\nInorder traversal (Recursive)");        
        bt.inOrderRecursive(bt.root);
        
    }
    
}
