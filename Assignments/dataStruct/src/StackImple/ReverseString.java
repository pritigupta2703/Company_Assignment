package StackImple;

/**
 * Created by pritigupta on 1/31/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s1 = "welcome to world";
        char[] t = s1.toCharArray();
        int i ,j;
        j = t.length-1;
        for (i=0;i<j;i++,j--)
        {
            char t1 = t[i];
            t[i] = t[j];
            t[j]=t1;

        }

        for (char c1 : t)
        {
            System.out.println(c1);

        }
    }

}
