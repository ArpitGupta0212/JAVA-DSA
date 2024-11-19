import java.util.*;
public class top_view_tree{
    static class node{
        int data;
        node right;
        node left;
         node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }
public static void main(String args[]){
    node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
    root.left.right=new node(5);
    root.right.left=new node(6);
    root.right.right=new node(7);
    topview(root);
}
static class info{
    int hd;
    node root;
    info(int hd,node root){
        this.hd=hd;
        this.root=root;
    }
}
public static void topview(node root){
    Queue <info> qu=new LinkedList<>();
    HashMap <Integer,node> map=new HashMap<>();
    int min=0,max=0;
    qu.add(new info(0,root));
    qu.add(null);
    while(!qu.isEmpty()){
        info curr_info=qu.remove();
        if(curr_info==null){
            if(qu.isEmpty()){
                break;
            }else{
                qu.add(null);
            }
        }else{
            if(!map.containsKey(curr_info.hd)){
                map.put(curr_info.hd,curr_info.root);
            }
            if(curr_info.root.left!=null){
                qu.add(new info(curr_info.hd-1,curr_info.root.left));
                min=Math.min(min,curr_info.hd-1);
            }
            if(curr_info.root.right!=null){
                qu.add(new info(curr_info.hd+1,curr_info.root.right));
                max=Math.max(max,curr_info.hd+1);
            }
        }
    }
    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
    }
    System.out.println();
}
}