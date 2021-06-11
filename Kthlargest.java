import java.util.*;
public class Kthlargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={5,1,3,10,20,7,15};
        int K=3;
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            minheap.add(arr[i]);
            System.out.println(minheap.peek());
            if(minheap.size()>K)
            {
                minheap.poll();
            }
        }
        System.out.println(minheap.poll());

    }
}
