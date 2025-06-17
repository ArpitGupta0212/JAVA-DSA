import java.util.*;
public class dfs {
    static class edge{
        int s;
        int d;
        int wt;
        edge(int s,int d,int wt){
            this.s=s;
            this.d=d;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<edge> graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));
        graph[1].add(new edge(1,3,1));
        graph[1].add(new edge(1,2,1));
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));
        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,5,1));
        graph[3].add(new edge(3,4,1));
        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));
        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));
        graph[6].add(new edge(6,5,1));
    }
    public static void dfsprint(ArrayList<edge> graph[],boolean visited[],int curr){
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(visited[e.d]==false){
                dfsprint(graph,visited,e.d);
            }
        }
    }
    public static void main(String args[]){
        int v=7;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph,v);
        boolean visited[]=new boolean[v];
        dfsprint(graph,visited,0); 
    }
}
