import java.util.Arrays;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []arr) {
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && smallest!=arr[i]){
                secondsmallest=arr[i];
            }
        }
        int b[]={secondlargest,secondsmallest};
        return b;
    }
}