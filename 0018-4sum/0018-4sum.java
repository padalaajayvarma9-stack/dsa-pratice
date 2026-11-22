class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int a = 0 ; a < n - 3; a++){
            if(a > 0 && nums[a] == nums[a-1])continue;
            for(int b = a+1; b < n - 2; b++){
                if(b > a+1 && nums[b] == nums[b-1])continue;
                int c = b + 1;
                int d = n - 1;
                while(c < d){
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if(sum == target){
                        result.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        int lastC = nums[c];
                        int lastD = nums[d];
                        c++;
                        d--;
                        while(c < d && nums[c] == lastC)c++;
                        while(c < d && nums[d] == lastD)d--;
                    }else if(sum < target){
                        c++;
                    }else{
                        d--;
                    }
                }

            }
        }
        return result;
        
    }
}