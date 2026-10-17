package Assignment6;

public class Q4 {

}


class Solution {
    class Pair implements Comparable<Pair>{
        int ele;
        int freq;

        public Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair other){

            int n =  Integer.compare(this.freq, other.freq);
            if(n==0) return Integer.compare(this.ele, other.ele);
            else return n;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : map.keySet()){
            int freq=map.get(key);
            pq.add(new Pair(key,freq));
            if(pq.size()>k) pq.remove();
        }

         int [] ans = new int[k];
        for(int i=0; i<k;i++){
            Pair top = pq.remove();
            ans[i] = top.ele;
        }
        return ans;
    }
}