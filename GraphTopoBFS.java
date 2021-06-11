/*import java.util.*;
public class GraphTopoBFS {


    public static void BFS(ArrayList<ArrayList<Integer>> adj, int indegree[], Queue<Integer> q) {
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.println(temp);
            for(int i:adj.get(temp))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }

        }
    }
    public static void Topo(ArrayList<ArrayList<Integer>> adj,int v,int indegree[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        BFS(adj,indegree,q);
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v,int indegree[])
    {
        adj.get(u).add(v);
        indegree[v]++;
    }
    public static void main(String []x)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int v=6;
        int indegree[]=new int[v];
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,5,0,indegree);
        addEdge(adj,4,0,indegree);
        addEdge(adj,5,2,indegree);
        addEdge(adj,4,1,indegree);
        addEdge(adj,2,3,indegree);
        addEdge(adj,3,1,indegree);
        Topo(adj,v,indegree);
    }
}


 */