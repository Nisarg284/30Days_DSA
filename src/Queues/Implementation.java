package Queues;


import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
     static class queueArr{
        static int f=0;
        static int r=0;
        static int size = 0;

        static int[] arr = new int[7];

        public void add(int val)
        {
            if(size >= arr.length)
            {
                System.out.println("Queue is full");
                return;
            }
            arr[r] = val;
            r++;
            size++;
        }

        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = arr[f];
            f++;
            size--;
            return val;
        }

        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public int getSize()
        {
            return size;
        }

        public void display(){
            if(!isEmpty())
            {
                for(int i=f;i<r;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else {
                System.out.println("Noting to Display");
            }

        }

    }

    public static void main(String[] args) {

        queueArr myQue = new queueArr();
        myQue.display();

        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        myQue.add(4);
        myQue.add(5);
        myQue.add(6);

        myQue.add(7);
        myQue.add(10);
        


        System.out.println("isEmpty: "+myQue.isEmpty());

        System.out.println("Size: "+myQue.getSize());

        System.out.println("Peek: "+myQue.peek());
        myQue.remove();
        System.out.println("Peek: "+myQue.peek());

        myQue.display();

        myQue.remove();
        myQue.display();









    }
}
