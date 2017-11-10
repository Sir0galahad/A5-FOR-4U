/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

/**
 *
 * @author millc9988
 */
public class A5Q3 {

    public boolean inLang(String word) {
        StringBuilder word2 = new StringBuilder(word);
        char[] characters = new char[word.length()];
        int i = 0;
        while (word2.charAt(i) != '$') {
            characters[i] = word2.charAt(i);
            i++;
        }
        int q = word.length()-1;
        while (word2.charAt(q) != '$') {
            characters[q] = word2.charAt(q);
            q--;
        }
        int m = word.length()-1;
        for (int j = 0; j < word.length()/2; j++) {
            if (characters[j]!=characters[m-j]) {
                return false;
            }     
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q3 memes = new A5Q3();
        if (memes.inLang("nathan$nathan")) {
            System.out.println("That is in the language.");
        }else{
            System.out.println("That isn't in the language.");
        }
    }
}
