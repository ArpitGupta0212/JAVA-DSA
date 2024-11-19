public class sorted_arr_to_bst{
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
        int arr[]={3,5,6,8,10,11,12};
        node root=create_sorted_balanced_tree(arr,0,arr.length-1);
        preorder(root);
    }
    public static node create_sorted_balanced_tree(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr[mid]);
        root.left=create_sorted_balanced_tree(arr,st,mid-1);
        root.right=create_sorted_balanced_tree(arr,mid+1,end);
        return root;
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