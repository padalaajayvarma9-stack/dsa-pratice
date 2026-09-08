class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int right = 0;right<k;right++){
            sum+=nums[right];
        }
        int maxSum = sum;
        int left = 0;
        for(int right = k; right < nums.length;right++){
            sum+=nums[right];
            sum-=nums[left];
            left++;
            maxSum=Math.max(maxSum,sum);
        }
        return(double) maxSum / k;
    }
}