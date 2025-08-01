class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int w : stones) {
            pq.offer(w);
        }
    
        while (pq.size() > 1) {
            int y = pq.poll(); 
            int x = pq.poll(); 

            if (y != x) {
                pq.offer(y - x); 
            }
            
        }
    
        return pq.isEmpty() ? 0 : pq.peek();
    }
}