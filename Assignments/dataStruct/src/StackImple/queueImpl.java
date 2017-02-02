package StackImple;
import java.io.PrintStream;
import java.util.*;
/**
 * Created by pritigupta on 1/28/17.
 */
public class queueImpl {
    public int Queue[];
    public int fr, r, size, len;

    public queueImpl(int s)    // constructor
    {
        size = s;
        len = 0;
        Queue = new int[size];
        fr = -1;
        r = -1;
    }

    public boolean isEmpty() {
        return fr == -1;

    }

    public boolean isFull() {
        return fr == 0 && r == size - 1;

    }

    public void insertEle(int i) {
        if (r == -1) {
            fr = 0;
            r = 0;
            Queue[r] = i;

        } else if (r + 1 >= size) {
            throw new IndexOutOfBoundsException("overflow");

        } else if (r + 1 < size) {
            Queue[++r] = i;
            len++;

        }


    }

    public int deleteEle() {
        if (isEmpty()) {
            throw new NoSuchElementException("underflow");

        } else {
            len--;
            int ele = Queue[fr];
            if (fr == r) {

                fr = -1;
                r = -1;

            } else
                fr++;
            return ele;


        }
    }

    public void display() {
        System.out.println("queue = ");
        if (len == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = fr; i <= r; i++)
            System.out.println(Queue[i] + "");

    }

    public static void main(String[] args) {
        queueImpl q1 = new queueImpl(5);

        try {
            q1.insertEle(7);

            q1.insertEle(6);
            //q1.deleteEle();
            //q1.deleteEle();
            q1.insertEle(8);
            //q1.deleteEle();
            q1.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}


