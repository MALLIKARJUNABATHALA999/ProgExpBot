import java.util.*;
public class SIngleELementINTrheice {
    public static void main(String args[]){
        int arr[]={5,5,5,2,4,4,4};
        int n=arr.length;
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < n; i++) {
           int key=arr[i];
           if(m.containsKey(key)){
               m.put(key,m.get(key)+1);
           }
           else{
               m.put(key,1);
           }
        }
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue()==1){
                System.out.println("found Key"+entry.getKey());
            }
        }
    }
}
