public class AASAMPLE {
    public static void main(String args[]) {
        int[] arr = {0,0,0,1,1,1,1,1};
        int n=arr.length;
        System.out.println(countnoof1sinbinarySortedArray(arr,0,n-1,1));

    }
    static int countnoof1sinbinarySortedArray(int arr[],int low,int high,int x){
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0|| arr[mid-1]==0){
                    return arr.length-mid;
                }
                else{
                    high=mid-1;
                }
            }
        }

        return -1;

    }
}

