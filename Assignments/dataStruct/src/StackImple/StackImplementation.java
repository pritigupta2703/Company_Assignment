package StackImple;

/**
 * Created by pritigupta on 1/27/17.
 */
public class StackImplementation {

    private int size;
    private int array1[];
    private static int top = -1;

    public StackImplementation(int size)
    {
        this.size = size;
        array1 = new int [size];
    }




    public int peek()
    {
        return array1[top];
    }

    public void push(int i) throws Exception
    {
        if(top == size-1) {
            throw new Exception("Stack Over");
        }
        else {
            System.out.println("element pushed : " + i);
            array1[++top] = i;
        }
    }

    public int pop() throws Exception
    {
        if(top == -1)
        {
            throw new Exception("Stack Under");

        }
        else
        {
            int res = array1[top--];
            System.out.println("element poped : " + res);
            return res;
        }
    }

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation(5);
        try {
            st.push(1);
            st.push(20);
            st.push(3);
            st.pop();
            st.push(40);
            st.pop();
            st.push(28);
            //st.push(44);
            //st.push(67);
            //st.push(78);
            //st.pop();
            //st.pop();
            //st.pop();
            //st.pop();
            //st.pop();
            //st.pop();



        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}