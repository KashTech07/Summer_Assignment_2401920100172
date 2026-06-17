class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int start = 1 ;
        int end = max(piles) ;
        int ans = 0 ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(canFinish(piles , mid , h)){
                ans = mid ;
                end = mid-1 ;
            }
            else{
               start = mid+1 ;
            }
        }
        return ans; 
     }
      static boolean canFinish(int[] piles , int mid , int h){
            long c = 0 ;
            for(int i = 0 ; i<piles.length ; i++){
                c += (piles[i]+(long)mid-1)/mid ;
            }
            return h>=c ;
        }
        static int max(int[] arr){
            int ans = 0 ;
            for(int i = 0 ;i<arr.length ; i++){
                if(arr[i]>ans){
                    ans = arr[i] ;
                }
            }
            return ans ;
        }
}
