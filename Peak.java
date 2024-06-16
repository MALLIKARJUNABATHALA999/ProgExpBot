package src;

public class Peak{
    public static void main(String args[]){
       
        int arr[] = {1,1,2,2,3,4,4,5,5,6,6};
       
        System.out.print(peak(arr));
    }
    public static int peak(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]) return arr[i];
                
                
            }
           else  if(i==n-1){
                 if(arr[i]!=arr[i-1]) {
                    return arr[i];
                }
            }
           else  if((arr[i]!=arr[i+1]) && (arr[i]!=arr[i+1])){
                return arr[i];
            }
        }
        return -1;
    }
}