import java.util.LinkedList;
import java.util.Queue;

public class tree1{
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
    static class Binarytree{
        static int idx=-1;
        public  node buildtree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            node nn=new node(arr[idx]);
            nn.left=buildtree(arr);
            nn.right=buildtree(arr);
            return nn;
        }
        public void preorderdisplay(node root){ //O(n)
            if(root ==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderdisplay(root.left);
            preorderdisplay(root.right);
        }
        public void inorderdisplay(node root){//O(n)
            if(root==null){
                return;
            }
            inorderdisplay(root.left);
            System.out.print(root.data+" ");
            inorderdisplay(root.right);
        }
        public void postorderdisplay(node root){
            if(root==null){
                return;
            }
            postorderdisplay(root.left);
            postorderdisplay(root.right);
            System.out.print(root.data+" ");
        }
        public void levelorderdisplay(node root){
            if(root==null){
                return;
            }
            Queue<node> qu=new LinkedList<>();
            qu.add(root);
            qu.add(null);
            while(!qu.isEmpty()){
                node currnode=qu.remove();
                if(currnode==null){
                    System.out.println();
                    if(qu.isEmpty()){
                        break;
                    }
                    else{
                    qu.add(null);
                    }
                }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null){
                        qu.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        qu.add(currnode.right);
                    }
                }
            }
        }
        public int heightoftree(node root){
            if(root == null){
                return 0;
            }
            int left_hei=heightoftree(root.left);
            int right_hei=heightoftree(root.right);
            return Math.max(left_hei,right_hei)+1;
        }
        public int countnodeoftree(node root){
            if(root==null){
                return 0;
            }
            int left_count=countnodeoftree(root.left);
            int right_count=countnodeoftree(root.right);
            return left_count+right_count+1;
        }
        public int sumofnodes(node root){
            if(root==null){
                return 0;
            }
            int left_sum=sumofnodes(root.left);
            int right_sum=sumofnodes(root.right);
            return left_sum+right_sum+root.data;
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        node root=tree.buildtree(arr);
        System.out.println("root = "+root.data);
        System.out.print("tree values in preorder = ");
        tree.preorderdisplay(root);
        System.out.println();
        System.out.print("tree values in inorder = ");
        tree.inorderdisplay(root);
        System.out.println();
        System.out.print("tree values in postorder = ");
        tree.postorderdisplay(root);
        System.out.println();
        System.out.println("tree values in levelorder = ");
        tree.levelorderdisplay(root);
        System.out.println("Height of tree = ");
        System.out.println(tree.heightoftree(root));
        System.out.println("No of nodes in tree = ");
        System.out.println(tree.countnodeoftree(root));
        System.out.println("Sum of tree = ");
        System.out.println(tree.sumofnodes(root));
    }
}