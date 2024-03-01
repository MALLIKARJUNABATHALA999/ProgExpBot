public class AASAMPLE {
    public static void main(String args[]) {
        int[] arr={1,10,10,10,20,20,20,40};
        int n=arr.length-1;
        System.out.println(countOccuranceinSortedArray(arr,20));
    }
    static int countOccuranceinSortedArray(int arr[],int x){
        int first=indexOfFirstOccuance(arr,0,arr.length-1,x);
        if(first==-1){
            return 0;
        }
        else{
            return  indexOfLastOccuance(arr,0,arr.length-1,x)-first+1;
        }
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

        }
            return -1;
    }
    static int indexOfLastOccuance(int arr[],int low,int high,int x){
        if(low>high) return -1;
        int mid=( low+high)/2;
        if(x>arr[mid]){
            return indexOfFirstOccuance(arr,mid+1,high,x);
        }
        else if(x<arr[mid]){
            return indexOfFirstOccuance(arr,low,mid-1,x);
        }
        else{
            if(mid==arr.length|| arr[mid]!=arr[mid+1]){
                return mid;
            }

        }
        return -1;
    }
}
