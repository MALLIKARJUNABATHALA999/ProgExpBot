public class AASAMPLE {
    public static void main(String args[]) {
        int[] arr={1,10,10,10,20,20,40};
        System.out.println(indexOfFirstOccuance(arr,0,arr.length-1,20));
    }
    static int indexOfFirstOccuance(int arr[],int low,int high,int x){
        if(low>high) return -1;
        int mid=( low+high)/2;
        if(x>arr[mid]){
            return indexOfFirstOccuance(arr,mid+1,high,x);
        }
        else if(x<arr[mid]){
            return indexOfFirstOccuance(arr,low,mid-1,x);
        }
        else{
            if(mid==0|| arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return indexOfFirstOccuance(arr,low,mid-1,x);
            }
        }

    }
}
