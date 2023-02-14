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
public class BinaryTree {
    private Node root;
    
    //traverse tree
    public void traverseTree(Node node){
        if(node !=null){
            traverseTree(node.left);
            System.out.println(" "+node.value);
            traverseTree(node.right);
        }
    }
}
