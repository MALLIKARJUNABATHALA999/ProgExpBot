public class AAA {
    public static void main(String args[]) {
        int arr[] = {30, 20, 40, 60, 5, 8};
        int n = arr.length;
        int result = peakElement(arr, n);
        System.out.println(result);
    }
    static int peakElement(int arr[], int n) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==0|| arr[mid]<=arr[mid-1] && mid==n-1 || arr[mid+1]<=arr[mid]){
                    return mid;
            }
            else{
                if(mid>0 && arr[mid-1]>=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}