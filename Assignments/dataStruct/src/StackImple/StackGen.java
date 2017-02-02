package StackImple;
import java.lang.Exception;

/**
 * Created by pritigupta on 2/1/17.
 */
public class StackGen<T extends Object> {
    private int sizestack;
    private T[] arraystack;
    private int top;


    public StackGen(int size)
    {
        this.sizestack = size;
        this.arraystack=((T[]) new Object[sizestack]);
        this.top = -1;


    }

    public void pushGen (T  i) throws Exception {
        if (top == sizestack - 1) {
            throw new Exception("Stack Over");
        } else {
            System.out.println("element pushed " +i);
            arraystack[++top] = i;
        }
    }

    public T popGen () throws Exception
    {
        if(top == -1)
        {
            throw new Exception("Stack Under");

        }
        else
        {
            T res = arraystack[top--];
            System.out.println("element poped " +res);
            return res;
    }

}


    public static void main(String[] args) throws Exception {
        StackGen<String> stringStackGen= new StackGen<>(5);
        stringStackGen.pushGen("java");
        stringStackGen.pushGen("corejava");
        stringStackGen.pushGen("advancejava");
        stringStackGen.pushGen("servlets");
        stringStackGen.popGen();
        stringStackGen.pushGen("c sharp");

        StackGen<Integer> integerStackGen = new StackGen<>(3);
        integerStackGen.pushGen(1);
        integerStackGen.pushGen(2);
        integerStackGen.pushGen(3);
        integerStackGen.popGen();


    }


}
