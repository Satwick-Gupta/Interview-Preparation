import java.util.*;
public class DetectCycleinDirectedGraph {
    public static boolean DFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],boolean recst[])
    {
        visited[s]=true;
        recst[s]=true;
        /*for(int i:adj.get(s))
        {
            if(visited[i]==false&&DFS(adj,i,visited,recst))
            {
                return true;
            }
            else if(recst[i]==true)
            {
              return true;
            }
        }
        */

        recst[s]=false;
        return false;
    }
    public static boolean DetectCycle(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        boolean recst[]=new boolean[v];
        for(int i=0;i<v;i++) {
            if (visited[i] == false) {
                if (DFS(adj, i, visited, recst) == true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int v=6;

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,5,0);
        addEdge(adj,4,0);
        addEdge(adj,5,2);
        addEdge(adj,4,1);
        addEdge(adj,2,3);
        addEdge(adj,3,1);
        System.out.println(DetectCycle(adj,v));
    }
}
