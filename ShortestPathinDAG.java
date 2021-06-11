/*import java.util.*;

public class ShortestPathinDAG {
    public static void DFS(ArrayList<ArrayList<Edge>> adj,int v,int indegree[],Queue<Integer> q,int distance[])
    {

        while(!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < adj.get(u).size(); i++)
            {
                    int v1=adj.get(u).get(i).destination;
                    indegree[v1]--;
                    if(indegree[v1]==0) {
                        q.add(v1);
                    }
                        if (distance[v1] > (distance[u] + adj.get(u).get(i).weight)) {
                            distance[v1] = distance[u] + adj.get(u).get(i).weight;
                        }



            }

        }
        for(int i=0;i<v;i++)
        {
            System.out.println(distance[i]);
        }

    }
    public static void Topo(ArrayList<ArrayList<Edge>> adj,int v,int indegree[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        int distance[]=new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i]=10000;
        }
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
                distance[i]=0;
            }
        }
        DFS(adj,v,indegree,q,distance);


    }
    public static void addEdge(ArrayList<ArrayList<Edge>> adj,int u,int v,int weight,int indegree[])
    {
        Edge e=new Edge(u,v,weight);
        adj.get(u).add(e);
        indegree[v]++;
    }
    public static void main(String[] args) {
        {
            ArrayList<ArrayList<Edge>> adj=new ArrayList<ArrayList<Edge>>();
            int vert=4;
            int indegree[]=new int[vert];
            for(int i=0;i<vert;i++)
            {
                adj.add(new ArrayList<Edge>());
            }
            addEdge(adj,0,1,1,indegree);
            addEdge(adj,1,2,3,indegree);
            addEdge(adj,2,3,4,indegree);
            addEdge(adj,1,3,2,indegree);
            Topo(adj,vert,indegree);


        }
    }
}


 */