public class SubSetSum {
    public static void main(String args[]){
        int arr[]={10,15,20};
       System.out.println( subsetsum(arr,25,3));
    }
    static int subsetsum(int arr[],int sum,int n){
        if(n==0){
            return (sum==0)?1:0;
        }
        return subsetsum(arr,sum,n-1)+subsetsum(arr,sum-arr[n-1],n-1);
    }
}
