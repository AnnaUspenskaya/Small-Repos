package tree;

import java.util.LinkedList;
import java.util.Queue;
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
    
    public void inOrderIterative(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                temp=st.pop();
                System.out.print(temp.value+" ");
                temp=temp.right;
            }
        }
    }
    //Post Order BT traversal 
    //-> traverse teh left subtree
    //-> traverse the right subtree
    //->visit the node
    
    public void postOrderRecursive(Node root){
        if(root==null){
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.value+" ");
    }
    public void postOrdreIterative(Node root){
        Node current = root;
        Stack<Node> st = new Stack<>();
        while(current!=null || !st.isEmpty()){
            if(current !=null){
                st.push(current);
                current=current.left;
            }else{
               Node temp = st.peek().right;
               if(temp==null){
                   temp=st.pop();
                   System.out.print(temp.value+" ");
                   while(!st.isEmpty() && temp==st.peek().right){
                       temp = st.pop();
                       System.out.print(temp.value+" ");
                   }
               }else{
                   current=temp;
               }
            }
        }
    }
    //Level Order BT traversal 
    //-> traverse teh left subtree
    //-> traverse the right subtree
    //->visit the node
    
    public void LevelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root); //add the root(1st level) to the queue
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.value + " ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.createBinaryTree();
        
        System.out.print("Preorder traversal (Iterative): ");
        bt.preOrderIterative(bt.root);
        System.out.print("\nPreorder traversal (Recursive): ");
        bt.preOrderRecursive(bt.root);
        System.out.print("\n\nInorder traversal(Iterative): ");
        bt.inOrderIterative(bt.root);
        System.out.print("\nInorder traversal (Recursive): ");        
        bt.inOrderRecursive(bt.root);
        System.out.print("\n\nPostorder traversal(Iterative): ");
        bt.postOrdreIterative(bt.root);
        System.out.print("\nPostorder traversal(Recursive): ");
        bt.postOrderRecursive(bt.root);
        System.out.print("\n\nLine order traversal: ");
        bt.LevelOrder(bt.root);
        
        System.out.println("\n\nBinary Search Tree");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(0);
        bst.insert(4);

        
        
    }
    
}
