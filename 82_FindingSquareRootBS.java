public class AAA {
    public static void main(String args[]) {
        int answer=isFloorRoot(10);
        System.out.println(answer);
    }
   static  int isFloorRoot(int x){
        int low=0;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=high+(low-high)/2;
            int msq=mid*mid;
            if(msq==x){
                return mid;
            }
            else if(msq>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

}
