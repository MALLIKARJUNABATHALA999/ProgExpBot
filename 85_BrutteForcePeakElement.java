public class AAA {
    public static void main(String args[]) {
        int arr[]={10,20,40,60,5,8};
        int n=arr.length;
        int result=RotatedSortedArray(arr,n,100);
        System.out.println(result);
    }
    static int RotatedSortedArray(int[] arr,int n,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            if(arr[mid]>x){
                if(x>=arr[low] && x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
