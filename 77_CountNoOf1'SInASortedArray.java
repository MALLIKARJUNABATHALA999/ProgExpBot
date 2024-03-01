public class AASAMPLE {
    public static void main(String args[]) {
        int[] arr = {0,0,0,1,1,1,1,1};
        int n=arr.length;
        int countnoof1sinbinarySortedArray=n- LeftoccuranceofElement(arr,0,n-1,1);
        System.out.println(countnoof1sinbinarySortedArray);
    }
    static int LeftoccuranceofElement(int arr[],int low,int high,int x){
        if(low>high) return -1;
        int mid=low+high/2;
        if(arr[mid]>x){
            return LeftoccuranceofElement(arr,mid+1,high,x);
        }
        else if(arr[mid]<x){
            return LeftoccuranceofElement(arr,low,mid-1,x);
        }
        else{
            if(mid==0||arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return LeftoccuranceofElement(arr,low,mid-1,x);
            }
        }
    }
}

