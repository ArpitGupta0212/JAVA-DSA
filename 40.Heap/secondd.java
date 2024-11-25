import java.util.ArrayList;

public class secondd {
    static class  heap {
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            arr.add(data);// add in last
            int x=arr.size()-1;//child index
            int par=(x-1)/2;//parent index
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            int data = arr.get(0);
            // swap o index with last index
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, data);
            // delete last index value;
            arr.remove(arr.size()-1);
            //  fix the heap using heapify
            heapify(0);
            return data;
        }
        private void heapify(int i){
            int left=(2*i)+1;
            int right=(2*i)+2;
            int minidx=i;
            if(left<arr.size() && arr.get(left)<arr.get(minidx)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minidx)){
                minidx=right;
            }
            if(i!=minidx){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        heap h=new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
