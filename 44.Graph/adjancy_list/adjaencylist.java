import java.util.*;
public class adjaencylist{
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
    public static void main(String args[]){
            //       (5)      
            // 0 ------ 1
            //         / \ 
            //    (1)/    \(3)
            //     /       \
            //    2 ------- 3 
            //    |     (1)
            //    |
            //    |(2)
            //    |
            //    4
            int v=5;
            ArrayList<edge> [] graph=new ArrayList[v];
            for(int i=0;i<v;i++){
                graph[i]=new ArrayList<>();
            }
            // for 0
            graph[0].add(new edge(0,1,5));
            // for 1
            graph[1].add(new edge(1,0,5));
            graph[1].add(new edge(1,2,1));
            graph[1].add(new edge(1,3,3));
            // for 2
            graph[2].add(new edge(2,1,1));
            graph[2].add(new edge(2,3,1));
            graph[2].add(new edge(2,4,2));
            // for3
            graph[3].add(new edge(3,1,3));
            graph[3].add(new edge(3,2,1));
            // for 4
            graph[4].add(new edge(4, 2, 2));
            for(int i=0;i<graph[2].size();i++){
                edge e=graph[2].get(i);
                System.out.println(e.d);
            }
    }
}