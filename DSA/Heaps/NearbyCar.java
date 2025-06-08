package DSA.Heaps;

import java.util.PriorityQueue;

public class NearbyCar {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSqr;
        int idx;
        Point(int x, int y, int distSqr, int idx) {
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSqr - p2.distSqr;
        }

    }

    public static void main(String[] args) {

        int arr[][] = {
            {1,1},
            {2,4},
            {4,1}
        };

        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i= 0; i<arr.length; i++) {
            int distSqr = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new Point(arr[i][0], arr[i][1], distSqr, i));
        }

        for(int i=0; i<k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
