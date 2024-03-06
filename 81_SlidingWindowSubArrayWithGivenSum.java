
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> outputlist =new ArrayList<Integer>();
        
        int sum=0;
        int i=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>s ){
                sum-=arr[i];
                i++;
            }
            if(sum==s && i<=j){
                outputlist.add(i+1);
                outputlist.add(j+1);
                return outputlist;
            }
        }
        outputlist.add(-1);
        return outputlist;
    }
}