import java.util.*;

public class lca_of_tree {
    static class node{
        int data;
        node left;
        node right;
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
        System.out.println(lca2(root,6,7).data);
    }
    public static node lca2(node root,int n1,int n2){
        if(root==null || root.data==n1 ||root.data==n2){
            return root;
        }
        node left_lca2=lca2(root.left,n1,n2);
        node right_lca2=lca2(root.right, n1, n2);
        if(left_lca2==null){
            return right_lca2;
        }
        if(right_lca2==null){
            return left_lca2;
        }
        return root;
    }
    public static boolean getpath(node root,ArrayList<node> path,int n){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean left_path=getpath(root.left,path,n);
        boolean right_path=getpath(root.right, path, n);
        if(left_path || right_path){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static node lca(node root,int n1,int n2){//O(n)
        ArrayList<node> path1=new ArrayList<>(); 
        ArrayList<node> path2=new ArrayList<>();
        getpath(root,path1,n1);
        getpath(root,path2,n2);
        int i=0;
        for(; i<path1.size() && i<path2.size() ;i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        node lc=path1.get(i-1);
        return lc;
    }
}
