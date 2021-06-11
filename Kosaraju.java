/*
import java.util.*;
public class Kosaraju {
    public static void kosaraju(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[])
    {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i:adj.get(s))
        {
            if(visited[i]==false)
            {
                visited[i]=true;
                kosaraju(adj,i,visited);
            }
        }
    }
    public static void DFSRec(ArrayList<ArrayList<Integer>> adj,int v,Stack<Integer> s1,int s,boolean visited[])
    {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i:adj.get(s))
        {
            if(visited[i]==false)
            {
                DFSRec(adj,v,s1,i,visited);
            }
        }
        s1.push(s);
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj,int v,ArrayList<ArrayList<Integer>> adj1)
    {
        Stack<Integer> s1=new Stack<Integer>();
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                DFSRec(adj,v,s1,i,visited);
                System.out.println(" ");
            }
        }
        boolean visited1[]=new boolean[v];
        while(!s1.isEmpty())
        {
            int temp=s1.pop();
            if(visited1[temp]==false) {
                kosaraju(adj1, temp, visited1);
                System.out.println(" ");
            }

        }




    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        {
            ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
            ArrayList<ArrayList<Integer>> adj1=new ArrayList<ArrayList<Integer>>();
            int v=6;
            for(int i=0;i<v;i++)
            {
                adj.add(new ArrayList<Integer>());
                adj1.add(new ArrayList<Integer>());
            }
            addEdge(adj,3,0);
            addEdge(adj,0,1);
            addEdge(adj,1,2);
            addEdge(adj,2,3);
            addEdge(adj,3,4);
            addEdge(adj,4,5);
            addEdge(adj,5,4);
            addEdge(adj1,0,3);
            addEdge(adj1,1,0);
            addEdge(adj1,2,1);
            addEdge(adj1,4,3);
            addEdge(adj1,5,4);
            addEdge(adj1,4,5);
            addEdge(adj1,3,2);
            DFS(adj,v,adj1);


        }
    }
}
*/