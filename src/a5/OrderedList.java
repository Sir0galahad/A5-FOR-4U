/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class OrderedList {

    private int numItems;
    private IntNode head;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        if (head == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else if (head.getNum() > num) {
            IntNode temp = new IntNode(num);
            IntNode oldHead = head;
            oldHead.setNext(head.getNext());
            head = temp;
            head.setNext(oldHead);
        } else {
            IntNode node = head;
            IntNode prev = null;
            while (node != null && node.getNum() < num) {
                prev = node;
                node = node.getNext();
            }
            IntNode temp = new IntNode(num);
            temp.setNext(node);
            prev.setNext(temp);


        }
        numItems++;
    }

    public void remove(int num) {
        if (head.getNum() == num) {
            head = head.getNext();
        } else {
        }
        numItems--;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int get(int pos) {
        IntNode node = head;
        for (int i = 0; i < pos; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OrderedList memes = new OrderedList();
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            memes.add(num);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        for (int i = 0; i < memes.size(); i++) {
            int number = memes.get(i);
            System.out.println(number);
        }
    }
}
