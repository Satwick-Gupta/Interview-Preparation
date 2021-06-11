import java.util.Arrays;
import java.util.Scanner;

public class MindTree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        int maxval=0;
        int count=0;


        for(int j=1;j<n;j++)
        {
           count=count+arr[j]-arr[j-1]-1;
        }
        System.out.println(count);
    }
}
