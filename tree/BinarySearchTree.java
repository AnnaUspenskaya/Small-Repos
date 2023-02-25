/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author anechka
 */
public class BinarySearchTree {

    private Node root;
    
    public void insert(int value){
        root = insert(root, value);
    }
    public Node insert(Node node, int value) {
        if(root==null){
            root=new Node(value);
            return root;
        }
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
        return node;
    }
    
    public void traverseInOrder(Node node){
        if(node!= null){
            traverseInOrder(node.left);
            System.out.println(" "+node.value);
            traverseInOrder(node.right);
        }
    }
}
