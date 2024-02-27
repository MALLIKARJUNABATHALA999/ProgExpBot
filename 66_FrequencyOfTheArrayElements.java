import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int start=1;
        int end=n;
        Map<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        int[] frequency=new int[n];
        for(int i=1;i<=n;i++){
            frequency[i-1]=h.getOrDefault(i,0);
        }
        return frequency;
    }
}