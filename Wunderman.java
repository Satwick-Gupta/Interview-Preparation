import java.util.*;
import java.util.Scanner;

public class Wunderman {
    public static void add(ArrayList<ArrayList<Integer>> adj,int i,int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();



        for(int i=0;i<=n+1;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=2;i<=n+1;i++)
        {
            int n1=1;
            while((i*n1)<=n+1)
            {
                add(adj,i,i*n1);
                n1++;
            }
        }



    }
}
