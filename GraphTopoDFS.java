/*import java.util.*;
public class GraphTopoDFS {
    public static void DFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],Stack<Integer> s1)
    {
        visited[s]=true;
        for(int i:adj.get(s))
        {
            if(visited[i]==false)
            {
                DFS(adj,i,visited,s1);
            }
        }
        s1.push(s);

    }
    public static void Topo(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                DFS(adj,i,visited,s);
            }
        }
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    public static void main(String []x)
    {
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
        Topo(adj,v);

    }
}

 */
