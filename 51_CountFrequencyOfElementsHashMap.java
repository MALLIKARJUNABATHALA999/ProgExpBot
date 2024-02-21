import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayOfElementByOptimalSol {
    public static void main(String args[]){
        FrequencyArrayOfElementByOptimalSol fq=new FrequencyArrayOfElementByOptimalSol();
        int arr[]={10,20,10,20,30,40,10,20,40,30};
        fq.countFreq(arr);
    }
    void  countFreq(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
