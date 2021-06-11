import java.util.*;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int maxfar=0;
        int maxend=0;
        for(int i=0;i<arr.length;i++)
        {
            maxend=maxend+arr[i];
            if(maxfar<maxend)
            {
                maxfar=maxend;
            }
            if(maxend<0)
            {
                maxend=0;
            }
        }
        System.out.println(maxfar);
    }
}
