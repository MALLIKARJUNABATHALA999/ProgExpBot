import java.util.HashSet;

public class Is0SubArraySUm {
    public static void main(String args[]){
        int arr[]={3,4,3,-1,1};
        int n=arr.length;
        System.out.println(zwe0subarraysum(arr,n));

    }
    static boolean zwe0subarraysum(int arr[],int n){
        int presum=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            presum+=arr[i];
            if(h.contains(presum)){
                return true;
            }
            if(presum==0){
                return true;
            }
            h.add(presum);
        }
        return false;
    }
}
