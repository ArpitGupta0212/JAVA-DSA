import java.util.*;
public class convert_bst_to_balance_bst {
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
    public static void preorder(node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        node root=new node(8);
        root.left=new node(6);
        root.left.left=new node(5);
        root.left.left.left=new node(3);
        root.right=new node(10);
        root.right.right=new node(11);
        root.right.right.right=new node(12);
        sortedarr(root,ll);
        node root1=create_sorted_balanced_tree(ll, 0, ll.size()-1);
        preorder(root1);
    }
    public static void sortedarr(node root, ArrayList<Integer> ll ){
        if(root==null){
            return;
        }
        sortedarr(root.left, ll);
        ll.add(root.data);
        sortedarr(root.right, ll);
    }
    public static node create_sorted_balanced_tree(ArrayList <Integer> ll,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(ll.get(mid));
        root.left=create_sorted_balanced_tree(ll,st,mid-1);
        root.right=create_sorted_balanced_tree(ll,mid+1,end);
        return root;
    }
}
