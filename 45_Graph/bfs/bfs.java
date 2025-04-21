import java .util.*;
public class bfs{
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
    public static void bfshelp(ArrayList<edge> []graph,boolean visited []){
        Queue<Integer> qu=new LinkedList<>();
        qu.add(0);
        while(!qu.isEmpty()){
            int curr=qu.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    qu.add(e.d);
                }
            }
        }
    }
    public static void main(String args[]){
        int v=7;
        ArrayList<edge> graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));
        graph[0].add(new edge(1,3,1));
        graph[0].add(new edge(1,2,1));
        graph[0].add(new edge(2,0,1));
        graph[0].add(new edge(2,4,1));
        graph[0].add(new edge(3,1,1));
        graph[0].add(new edge(3,5,1));
        graph[0].add(new edge(3,4,1));
        graph[0].add(new edge(4,2,1));
        graph[0].add(new edge(4,3,1));
        graph[0].add(new edge(4,5,1));
        graph[0].add(new edge(5,3,1));
        graph[0].add(new edge(5,4,1));
        graph[0].add(new edge(5,6,1));
        graph[0].add(new edge(6,5,1));
        boolean visited []=new boolean[v];
        System.out.println();
        bfshelp(graph,visited);
    }
}