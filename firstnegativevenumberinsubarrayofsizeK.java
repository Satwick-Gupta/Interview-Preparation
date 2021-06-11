import java.util.*;
public class firstnegativevenumberinsubarrayofsizeK {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={12,1,7,-8,-16,30,16,28};
        int i=0;
        int j=0;
        int K=3;
        Queue<Integer> q=new LinkedList<Integer>();
        while(j<arr.length)
        {
            if(arr[j]<0)
            {
                q.add(arr[j]);
            }
            if((j-i+1)!=K)
            {
                j++;
            }
            else if((j-i+1)==K)
            {
                System.out.println(q.peek());
                if(arr[i]<0)
                {
                    q.poll();
                }
                i++;
                j++;
            }
        }
    }
}
