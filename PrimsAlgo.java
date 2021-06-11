/*import java.util.*;
public class PrimsAlgo {
    public static int primsalgo(ArrayList<ArrayList<Edge>> adj,int v)
    {
        boolean visited[]=new boolean[v];
        int distance[]=new int[v];
        for(int i=0;i<v;i++)
        {
            distance[i]=1000;
        }
        distance[0]=0;
        int res=0;

        for(int count=0;count<v;count++)
        {
            int u=-1;
            for(int i=0;i<v;i++)
            {
                if(!visited[i]&&(u==-1||distance[i]<distance[u]))
                {
                    u=i;
                }
            }
            res=res+distance[u];
            visited[u]=true;
            for(int i=0;i<adj.get(u).size();i++)
            {
                int v1=adj.get(u).get(i).destination;
                if(visited[v1]==false)
                {
                    if(distance[v1]>adj.get(u).get(i).weight)
                    {
                        distance[v1]=adj.get(u).get(i).weight;
                    }

                }
            }

        }
        return res;
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
            System.out.println(primsalgo(adj,v));
        }
    }
}
*/