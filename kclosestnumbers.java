import java.util.*;
import java.lang.*;
public class kclosestnumbers {
    static class Node
    {
        int a;
        int b;
        Node(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    static class Comp implements Comparator<Node>
    {

        public int compare(Node n1,Node n2)
        {
            int p=n1.a;
            int q=n2.a;
            if(p>q)
            {
                return 1;
            }
            else if(p<q)
            {
                return -1;
            }
            else
            {
                return 0;
            }

        }
    }
    public static void main(String[] args) {
        PriorityQueue<Node> maxheap=new PriorityQueue<Node>(1,new Comp());
        int arr[]={5,1,3,10,20,7,15};
        int X=5;
        int K=4;
        for(int i=0;i<arr.length;i++)
        {
            Node node=new Node((X-arr[i]),arr[i]);

            maxheap.offer(node);
            if(maxheap.size()>K)
            {
                maxheap.poll();
            }
        }
        while(!maxheap.isEmpty())
        {
            Node p=maxheap.poll();
            System.out.println(p.b);
        }

    }
}
