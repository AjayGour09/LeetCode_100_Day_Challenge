class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            if(Pq.size()<k){
                Pq.add(nums[i]);
            }else if(Pq.peek()<nums[i]){
                Pq.remove();
                Pq.add(nums[i]);
            }
        }
        return Pq.peek();
    }
}