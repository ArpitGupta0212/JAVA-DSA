import java.util.*;

public class job_sequencing {
    static class job{
        int idx;
        int deadline;
        int profit;
        public job(int idx,int deadline,int profit){
            this.idx=idx;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jbs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++){
            jbs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));
        } 
        Collections.sort(jbs,(obj1,obj2)->obj2.profit-obj1.profit);
        ArrayList<Integer> ans=new ArrayList<>();
        int st=jbs.get(0).deadline;
        ans.add(jbs.get(0).idx);
        int profit=jbs.get(0).profit;
        for(int i=1;i<jbs.size();i++){
            if(st<jbs.get(i).deadline){
                ans.add(jbs.get(i).idx);
                st=jbs.get(i).deadline;
                profit+=jbs.get(i).profit;
            }
        }
        System.out.println();
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        System.out.println(ans.size()+" "+profit);
    }
}
