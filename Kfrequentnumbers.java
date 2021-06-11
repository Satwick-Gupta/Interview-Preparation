import java.util.*;
public class Kfrequentnumbers {
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
    static class comp implements Comparator<Node>
    {
        public  int compare(Node p,Node q)
        {
            int a=p.a;
            int b=q.a;
            if(a>b)
            {
                return 1;
            }
            if(a<b)
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
        PriorityQueue<Node> maxheap=new PriorityQueue<Node>(1,new comp());
        int arr[]={1,1,1,3,2,2,4};
        int K=2;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(!h.containsKey(arr[i]))
            {
                h.put(arr[i],1);
            }
            else
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                Node a=new Node(h.get(arr[i]),arr[i]);
                h.remove(arr[i]);
                maxheap.add(a);
                if(maxheap.size()>K)
                {
                    maxheap.poll();
                }
            }
        }
        while(!maxheap.isEmpty())
        {
            System.out.println(maxheap.poll().b);
        }
    }
}
