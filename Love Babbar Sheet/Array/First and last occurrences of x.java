class GFG
{
    static long lowerBound(long arr[],int low,int high,int x){
        long ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
    
     static long upperBound(long arr[],int low,int high,int x){
        long ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
       }
       return ans;
        
    }
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> arli=new ArrayList<>();
        arli.add(lowerBound( arr, 0 , n-1,x));
        arli.add(upperBound(arr, 0, n-1, x));
        return arli;
    }
}
