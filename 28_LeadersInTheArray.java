import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code h
        List<Integer> ldr=new ArrayList<>();
        int n=a.length;
        int rightmax=a[n-1];
        ldr.add(rightmax);
        for(int i=n-2;i>=0;i--){
            if(a[i]>rightmax){
                rightmax=a[i];
                ldr.add(rightmax);
            }
        }
        
        return ldr;
    }
}