import java.util.*;
public class Ksorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={6,5,3,2,8,10,9};
        int K=3;
        PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            minheap.add(arr[i]);

            if(minheap.size()==K+1)
            {

               arr[j]=minheap.poll();
               j++;
            }
        }
        while(!minheap.isEmpty())
        {
            arr[j]=minheap.poll();
            j++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }



    }
}
