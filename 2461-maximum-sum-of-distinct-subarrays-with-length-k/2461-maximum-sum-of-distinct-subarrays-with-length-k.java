class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max_sum = 0;

        int left = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int right = 0 ; right < nums.length ; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum = sum - nums[left];
                left++;
            }

            set.add(nums[right]);
            sum = sum + nums[right];

            if(right - left + 1 > k){
                set.remove(nums[left]);
                sum = sum - nums[left];
                left++;
            }

            if(right - left + 1 == k){
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}