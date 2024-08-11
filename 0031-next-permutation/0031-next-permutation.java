class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length-1;

        //find the first decreasing element from the end
        int i=n-1;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //if such ele is found
        if(i>=0){
            //find the element just larger than nums[i]
            int j=n;
            while(nums[j]<=nums[i]){
                j--;
            }
            //swap them
            swap(nums,i,j);
        }//reverse the elements after index i
        reverse(nums,i+1,n);

    }
    private void swap(int[] nums, int i,int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums,int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}