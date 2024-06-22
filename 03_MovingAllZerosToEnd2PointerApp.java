    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            int[] arr={2,0,0,4,5,6,0,7,8,0};
            int[] result=movingallzeros(arr);
            System.out.println(Arrays.toString(arr));
        }
        private static int[] movingallzeros(int[] arr){
            int n=arr.length;
            int j=-1;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    j=i;
                    break;
                }
            }
            if(j==-1) return arr;
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
            return arr;
        }
   }