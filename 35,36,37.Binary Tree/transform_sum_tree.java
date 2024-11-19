import java.util.*;
public class transform_sum_tree {
    public static void levelorderdisplay(node root){
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
        public static int transform(node root){
            if(root==null){
                return 0;
            }
            int left=transform(root.left);
            int right=transform(root.right);
            int data1=root.data;
            int newleft=root.left==null?0:root.left.data;
            int newright=root.right==null?0:root.right.data;
            root.data=newleft+left+newright+right;
            return data1;
        }
        public static void main(String args[]){
            node root=new node(1);
            root.left=new node(2);
            root.right=new node(3);
            root.left.left=new node(4);
            root.left.right=new node(5);
            root.right.left=new node(6);
            root.right.right=new node(7);
            transform(root);
            levelorderdisplay(root);
    }
    
    }

