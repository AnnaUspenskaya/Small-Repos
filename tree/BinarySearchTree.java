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

    Node root;

    public void insert(Node node, int value) {
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
    }
    
    public void traverseInOrder(Node node){
        if(node!= null){
            traverseInOrder(node.left);
            System.out.println(" "+node.value);
            traverseInOrder(node.right);
        }
    }
}
