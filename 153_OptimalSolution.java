import java.util.*;
public class Main {
    public static void main(String[] args) {
            int[] nums={5,4,0,3,1,6,2};
            System.out.println(longestlength(nums));

    }
   private static int longestlength(int[] nums){
        int maxlen=0;
        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!visited.contains(nums[i])){
            int ptr=nums[i];
            int length=0;
            while(ptr!=nums[i] || length==0){
                length++;
                visited.add(nums[i]);
                ptr=nums[ptr];

            }
            maxlen=Math.max(maxlen,length);
        }}
        return maxlen;
   }
}