class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        
        int max = arr[0];
        int sum = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            if(sum+arr[i]>arr[i]){
                sum=sum+arr[i];
            }else{
                sum=arr[i];
            }
            
            if(sum>max){
                max = sum;
            }
        }
        
        return max;
    }
}
