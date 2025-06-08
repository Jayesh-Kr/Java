package DSA.Heaps;

import java.util.ArrayList;

public class HeapImp {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int value) {
            arr.add(value);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(x > 0 && arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left))
                minIdx = left;

            if(right < arr.size() && arr.get(minIdx) > arr.get(right))
                minIdx = right;

            if(minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            // Three step process
            // -> Swap first and last node
            // -> Remove the last index (i.e. the smallest element)
            // -> Fix heap

            int data = arr.get(0);

            // swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // delete last
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(40);
        h.add(1);
        h.add(2);
        h.add(7);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
