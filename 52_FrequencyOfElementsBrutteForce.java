public class FrequencyOfelements {
    public static void main(String args[]){
        int arr[]={10,20,30,10,30,20,40,50};
        FrequencyOfelements fe=new FrequencyOfelements();
        fe.printFreq(arr);
    }
    void printFreq(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                continue;
            }
            int freq=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
}
