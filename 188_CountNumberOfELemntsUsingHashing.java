import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2};
        HashMap<Integer,Integer> elementCount=new HashMap<>();
        for(int num:arr){
            if(elementCount.containsKey(num)){
                elementCount.put(num,elementCount.get(num)+1);
            }
            else{
                elementCount.put(num,1);
            }
        }for (HashMap.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

}
