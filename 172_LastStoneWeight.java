class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0) return 0;
        if(stones.length==1) return stones[0];
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int stone:stones){
                pq.add(stone);
            }
            while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first != second) {
                pq.add(first - second);
            }
        }
        
    return pq.isEmpty()? 0 :pq.peek();
    }
}