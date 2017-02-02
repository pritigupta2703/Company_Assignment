package StackImple;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by pritigupta on 1/31/17.
 */
public class IsAnagram {

    static void isAna ( String s1 , String s2)
    {
        boolean status = true;
        if (s1.length() != s2.length())
        {
            status = false ;

        }
        else
        {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array,s2Array);
            if (status)
            {
               System.out.println("are anagrams");
            }
            else
            {
                System.out.println("are not anagrams");

            }

        }

    }

    public static void main(String[] args) {
        isAna("joy", "yoj");
        isAna("abc","bcc");
    }


}
