import java.util.*;
public class first{
    static class student implements Comparable<student> {
        String name;
        int rank;
        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student s){
            return this.rank-s.rank;
        }
    }
    public static void main(String[] args) {
        // Decending order
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(9);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println("dq");
        // ascending order
        PriorityQueue<Integer> dq=new PriorityQueue<>();
        dq.add(3);
        dq.add(5);
        dq.add(1);
        dq.add(9);
        while(!dq.isEmpty()){
            System.out.println(dq.peek());
            dq.remove();
        }
        // class priorityQueue
        PriorityQueue<student> ps=new PriorityQueue<>();
        ps.add(new student("a", 4));
        ps.add(new student("d", 85));
        ps.add(new student("b", 9));
        ps.add(new student("c", 78));
        while (!ps.isEmpty()) {
            System.out.println(ps.peek().name+" = "+ps.peek().rank);
            ps.remove();
        }
    
    }
}