import java.util.*;
public class maxsumsubarrayofsizeK {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={2,5,1,8,2,9,1};
        int i=0;
        int j=0;
        int K=3;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            if((j-i+1)!=K)
            {
                j++;
            }
            else if((j-i+1)==K)
            {
                max=Math.max(sum,max);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
