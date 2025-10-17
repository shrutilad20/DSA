121. Best Time to Buy and Sell Stock

  class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=0;
        
        for(int i=0;i<arr.length;i++){
                  
            if(arr[i]<min){
                min=arr[i];
            }

           else  if(arr[i]-min >max)
                {
                   max = arr[i]-min;
                }


            
        }
    
            return max;

}}
  
