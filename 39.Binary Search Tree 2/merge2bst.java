import java.util.*;

public class merge2bst {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void inorder(node root,ArrayList<Integer> ll){
        if(root==null){
            return ;
        }
        inorder(root.left, ll);
        ll.add(root.data);
        inorder(root.right, ll);
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
    public static node onebalancedbst(node root1,node root2){
        ArrayList<Integer> ll1=new ArrayList<>();
        inorder(root1,ll1);
        ArrayList<Integer> ll2=new ArrayList<>();
        inorder(root2,ll2);
        ArrayList <Integer> ll3=new ArrayList<>();
        int i=0,j=0;
        while(i<ll1.size() && j<ll2.size()){
            if(ll1.get(i)<=ll2.get(j)){
                ll3.add(ll1.get(i));
                i++;
            }else{
                ll3.add(ll2.get(j));
                j++;
            }
        }
        while(i<ll1.size()){
            ll3.add(ll1.get(i));
            i++;
        }
        while(j<ll2.size()){
            ll3.add(ll2.get(j));
            j++;
        }
        return create_sorted_balanced_tree(ll3,0, ll3.size()-1);

    }
    public static void main(String[] args) {
       node root1=new node(2);
       root1.left=new node(1);
       root1.right=new node(4);
       node root2=new node(9);
       root2.left=new node(3);
       root2.right=new node(12);
       node root=onebalancedbst(root1,root2);
       preorder(root);
    }
    public static void preorder(node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
