
class Solution {
    public int lowerBound(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }

     public int upperBound(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            lowerBound(nums, target),
            upperBound(nums, target)
        };
        
    }
}
