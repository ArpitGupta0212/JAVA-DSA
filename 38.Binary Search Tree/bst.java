import java.util.*;

public class bst {
        static class  node {
        
            int data;
            node right;
            node left;
            node(int data){
                this.data=data;
            }
        }
        public static void inorder(node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static node insert(node root,int val ){
            if(root==null){
                root = new node(val);
                return root;
            }
            if(root.data>val){
                root.left=insert(root.left, val);
            }
            else{
                root.right=insert(root.right, val);
            }
            return root;
        }
        public static void main(String[] args) {
            int arr[]={1,1,1};
            node root=null;
            for(int i=0;i<arr.length;i++){
                root=insert(root, arr[i]);
            }
            // inorder(root);
            // System.out.println(search_bst(root, 9));
            // inorder(root);
            // delete(root, 3);
            // inorder(root);
            // printrange(root, 3, 11);
            // printroot2leaf(root, new ArrayList<>());
            inorder(root);
            if(validBst(root,null,null)){
            System.out.println("valid");
            }
            else{
                System.out.println("in valid");
            }
        }   
        // search in bst
        public static boolean search_bst(node root,int key){ //O(H)
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search_bst(root.left, key);
            }
            else{
                return search_bst(root.right, key);
            }
        }
        // delete node
        public static node delete(node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{
            // 1 case leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            // 2 case one child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // 3 case two child
            node is=findInorderSuccesor(root.right);
            root.data=is.data;
            root.right=delete(root.right,is.data);
        }     
        return root;
        }
        public static node findInorderSuccesor(node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
        // given range values
    public static void printrange(node root,int k1,int k2){
        if(root==null){
            return ;
        }
        if(k1<=root.data && k2>=root.data){
            printrange(root.left, k1, k2);
            System.out.println(root.data);
            printrange(root.right, k1, k2);
        }
        else if(k2<root.data){
            printrange(root.left, k1, k2);
        }
        else{
            printrange(root.right, k1, k2);
        }
    }
    // print root to leaf all paths
    public static void printroot2leaf(node root,ArrayList<Integer> ll){
        if(root==null){
            return; 
        }
        ll.add(root.data);
        if(root.left==null && root.right==null){
            printpathhelper(ll);
        }
        printroot2leaf(root.left, ll);
        printroot2leaf(root.right, ll);
        ll.remove(ll.size()-1);
    }
    public static void printpathhelper(ArrayList<Integer>ll){
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println();
    }
    public static boolean validBst(node root, node min, node max) {
    if (root == null) {
        return true;
    }
    if (min != null && root.data <= min.data) {
        return false; // Root's data must be greater than min's data
    }
    if (max != null && root.data >= max.data) {
        return false; // Root's data must be less than max's data
    }
    // Recursively check left and right subtrees
    return validBst(root.left, min, root) && validBst(root.right, root, max);
}

}