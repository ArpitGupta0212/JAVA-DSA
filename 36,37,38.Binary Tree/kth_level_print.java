import java.util.*;

public class kth_level_print {
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
        static class info{
            int le;
            node node;
            info(int le,node node){
                this.le=le;
                this.node=node;
            }
        }
        public static void kth_level_by_iterative(node node,int k){
            Queue <info> qu=new LinkedList<>(); 
            qu.add(new info(1,node));
            qu.add(null);
            while(!qu.isEmpty()){
                info curr=qu.remove();
                if(curr==null){
                    if(qu.isEmpty()){
                        break;
                    }
                    else{
                        qu.add(null);
                    }
                }
                else{    
                if(curr.node!=null){
                    qu.add(new info(curr.le+1,curr.node.left));
                }
                if(curr.node!=null){
                    qu.add(new info(curr.le+1,curr.node.right));
                }
                if(curr.le==k){
                    System.out.print(curr.node.data+" ");
                }
            }
        }
        System.out.println();
        }
        public static void kth_level_by_rec(node root,int k,int level){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            kth_level_by_rec(root.left, k, level+1);
            kth_level_by_rec(root.right, k, level+1);
        }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        // kth_level_by_rec(root,3,1);
        kth_level_by_iterative(root, 3);
    } 
}

