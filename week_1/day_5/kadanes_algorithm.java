public class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0 ;
        int ans = Integer.MIN_VALUE ;
        for(int i = 0 ; i<nums.length ; i++){
            currsum=Math.max(nums[i] , currsum+nums[i]) ;
            ans = Math.max(ans , currsum);
        }
        return ans ;}}
