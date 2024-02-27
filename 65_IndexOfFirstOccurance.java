public class IndexOfFirstOccurance {
    public static void main(String args[]){
        int arr[]={5,5,5,5};
        int low=0;
        int high=arr.length-1;
        binarySearch(arr,low,high,5);

    }
    public static int  binarySearch(int arr[],int low,int high,int x){
         low=0;
         high=arr.length-1;
        int mid=(low+high)/2;
        if(low>high) return -1;
        if(arr[mid]<x){
            binarySearch(arr,mid+1,high,x);
        }
        else if(arr[mid]>x){
            binarySearch(arr,low,mid-1,x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return binarySearch(arr,low,mid-1,x);

            }
        }
        return -1;
    }
}
