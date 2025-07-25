class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs= new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]>0){
                hs.add(nums[i]);
            }
        }
        int sum=0;
        for(int i: hs){
            sum=sum+i;
        }
        if(sum>0){
            return sum;
        }else{
            return max;
        }
    }
}