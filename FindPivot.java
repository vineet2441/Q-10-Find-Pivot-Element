class Solution {
    public int pivotIndex(int[] nums) {
        int sum1=0;
        int sum2=0;
        
       for(int i=0; i<nums.length; i++){
        if(i==0){
            sum1=sum1+0;
        }
        else{
        sum1=sum1+nums[i-1];}
        for(int j=i+1; j<nums.length; j++){
            sum2=sum2+nums[j];
            

        }
        if(sum1==sum2){
            return i;
        }
        sum2=0;
       } 
       return -1;
    }
}
