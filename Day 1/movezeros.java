package hackerrank;
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int temp=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
                    
            }    
                                  
        }
        
    }
}