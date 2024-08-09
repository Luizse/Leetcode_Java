class Solution {
    public int maxSubArray(int[] nums) {
        //[-2,1,-3,4,-1,2,1,-5,4] 
        int Csum=0;
        int Msum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            Csum+=nums[i];
            if(Msum<Csum){
                Msum=Csum;
            }
            if(Csum<0){
                Csum=0;
            }
        }
            return Msum;
    }

}