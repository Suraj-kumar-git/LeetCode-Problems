class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums.length==1) return;
       int low=0,mid=0,high=nums.length-1;
       while(mid<=high){
           if(nums[mid]==0){
               swap(nums,mid,low);
               low++;
               mid++;
           }else if(nums[mid]==1) mid++;
           else{
               swap(nums,mid,high);
               high--;
           }
       }
    }
    public void swap(int[] arr,int first, int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}