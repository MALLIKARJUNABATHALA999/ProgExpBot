public class PrintAllDivisorsIncreasingOrder {
    public static void main(String[] args) {
        int[] petrol={50,10,60,100};
        int[] distance={30,20,100,10};
        int n=petrol.length;
        System.out.println(CircularTour(petrol,distance,n));
    }
    public static int CircularTour(int[] petrol,int[] distance,int n) {
        for(int start=0;start<n;start++){
            int curr_petrol=0;
            int end=start;
            while(true){
                curr_petrol+=(petrol[start]-distance[start]);
                if(curr_petrol<0){
                    break;
                }
                end=(end+1)%n;
                if(start==end){
                    return (start+1);
                }
            }
        }
        return -1;
    }
}
