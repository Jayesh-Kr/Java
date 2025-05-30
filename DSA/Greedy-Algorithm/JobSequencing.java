// package DSA.Greedy-Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JobSequencing {

    static class Jobs {
        int deadline;
        int profit;
        int id;

        Jobs(int i, int d, int p) {
            this.deadline = d;
            this.profit = p;
            this.id = i;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4,20} , {1,10}, {1,40}, {1,30}};

        ArrayList<Jobs> job = new ArrayList<>();

        for(int i = 0; i < jobInfo.length; i++ ) {
            job.add(new Jobs(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(job , (a,b) -> b.profit - a.profit);  // desending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(int i =0; i<job.size(); i++) {
            Jobs curr = job.get(i);

            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum jobs that we can do : " + seq.size());
        System.out.println(seq);
    }
}
