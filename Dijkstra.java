/*import java.util.*;
public class Dijkstra {
    public static void DijkstraAlgo(ArrayList<ArrayList<Edge>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        int distance[]=new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i]=1000;
        }
        distance[0]=0;
        for(int i=0;i<v;i++)
        {
            int u=-1;
            for(int j=0;j<v;j++)
            {
                if(!visited[i]&&(u==-1||distance[u]>distance[i]))
                {
                    u=i;
                }
            }
            for(int j=0;j<adj.get(u).size();j++)
            {
                int v1=adj.get(u).get(j).destination;
                if(distance[v1]>distance[u]+adj.get(u).get(j).weight)
                {
                    distance[v1]=distance[u]+adj.get(u).get(j).weight;
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(distance[i]);
        }
    }
    public static void addEdge(ArrayList<ArrayList<Edge>> adj,int u,int v,int weight)
    {
        Edge e=new Edge(u,v,weight);
        Edge e1=new Edge(v,u,weight);
        adj.get(u).add(e);
        adj.get(v).add(e1);
    }
    public static void main(String[] args) {
        {
            ArrayList<ArrayList<Edge>> adj=new ArrayList<ArrayList<Edge>>();
            int v=4;
            for(int i=0;i<v;i++)
            {
                adj.add(new ArrayList<Edge>());
            }
            addEdge(adj,0,1,5);
            addEdge(adj,1,2,10);
            addEdge(adj,0,2,8);
            addEdge(adj,2,3,20);
            addEdge(adj,1,3,15);
            DijkstraAlgo(adj,v);
        }
    }
}

 */
