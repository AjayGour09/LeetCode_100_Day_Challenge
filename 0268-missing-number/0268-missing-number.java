class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actuaSum = (range * (range + 1))/2;
        int currsum = 0;
        for(int i =0; i< range; i++){
            currsum = currsum + nums[i];

        }  
        int ans = actuaSum - currsum;
        return ans ;
    }
    
}