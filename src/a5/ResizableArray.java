/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

/**
 *
 * @author millc9988
 */
public class ResizableArray {

    private int array[];
    private int numItems;

    public ResizableArray() {
        array = new int[10];
        numItems = 0;
    }

    public void add(int num, int index) {
        while (index > array.length) {
            int[] temp = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[index] = num;
        numItems++;
    }

    public void remove(int index) {
        array[index] = 0;
        numItems--;
    }

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return numItems;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResizableArray memes = new ResizableArray();
        if (memes.isEmpty()) {
            System.out.println("yup its empty");
        } else {
            System.out.println("nah there is stuff in here");
        }
        System.out.println("the size is " + memes.size());
        memes.add(5, 0);
        memes.add(7, 3);
        memes.add(9, 24);
        memes.add(54, 20);
        memes.add(45, 300);
        System.out.println(memes.get(0));
        System.out.println(memes.get(3));
        System.out.println(memes.get(24));
        System.out.println(memes.get(20));
        System.out.println(memes.get(300));
        System.out.println("the size is " + memes.size());
        memes.remove(0);
        memes.remove(24);
        memes.remove(300);
        System.out.println("the size is " + memes.size());
        if (memes.isEmpty()) {
            System.out.println("yup its empty");
        } else {
            System.out.println("nah there is stuff in here");
        }
        memes.remove(3);
        memes.remove(20);
        System.out.println("the size is " + memes.size());
        if (memes.isEmpty()) {
            System.out.println("yup its empty");
        } else {
            System.out.println("nah there is stuff in here");
        }
       
    }
}
