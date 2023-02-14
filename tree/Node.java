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
public class Node {
    //data stored in the node  
    int value; 
    //pointers to the left and right nodes 
    Node left, right;
    
    Node(int value){
        this.value=value;
        //left=right=null;
    }
}
