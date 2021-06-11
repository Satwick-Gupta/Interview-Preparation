import java.util.*;
public class Kthsmallest
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={5,1,3,10,20,7,15};
        int K=2;
        PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            maxheap.add(arr[i]);

            if(maxheap.size()>K)
            {
                maxheap.poll();
            }
        }
        System.out.println(maxheap.poll());

    }
}
