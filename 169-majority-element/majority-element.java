class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int el=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(el == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(el==nums[i]){
                cnt1++;
            }
            if(cnt1>(n/2)){
                return el;
            }
        }
        return -1;
    }
}



//  HashMap<Integer,Integer> map= new HashMap<>();
//         int n = nums.length;
//         for(int num: nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         for(Map.Entry<Integer,Integer> it : map.entrySet()){
//             if(it.getValue() > (n/2)){
//                 return it.getKey();
//             }
//         }
//         return -1;