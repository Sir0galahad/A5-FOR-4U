/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

/**
 *
 * @author millc9988
 */
public class IntNode {

    private int item;
    private IntNode next;

    public IntNode(int num) {
        item = num;
        next = null;
    }

    public int getNum() {
        return item;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode node) {
        next = node;
    }
}
