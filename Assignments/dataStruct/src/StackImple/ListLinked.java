package StackImple;

/**
 * Created by pritigupta on 2/2/17.
 */
public class ListLinked {
    Node head;

    class Node
    {
        int data;
        Node next;

        public Node(int d)
        {
            data = d;
            next = null;
        }


    }

    public void addElement (int data1)
    {
        Node n1 = new Node(data1);
        n1.next=head;
        head=n1;

    }

    public void display ()
    {
        Node dnode = head;
        while (dnode != null)
        {
            System.out.print(dnode.data+">");
            dnode=dnode.next;
        }
       System.out.println("Null");
    }

    public void middleEle()
    {
        Node s = head;
        Node f = head;
        if(head != null)
        {
            while(f != null && f.next != null)
            {
                f = f.next.next;
                s =s.next;

            }
            System.out.println("middle element is "+s.data);
        }

    }


    public static void main(String[] args) {
        ListLinked l1 = new ListLinked();

        
            l1.addElement(10);
            l1.addElement(2);
            l1.addElement(30);
            l1.addElement(45);
            l1.addElement(60);

        l1.display();
        l1.middleEle();

    }



    }




