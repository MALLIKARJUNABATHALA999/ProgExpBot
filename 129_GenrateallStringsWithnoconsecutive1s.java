import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List< String > generateString(int N) {
        // Write your code here.
        List<String> result=new ArrayList<>();
        generate(N,"",result);
        return result;
    }
    public static void generate(int N,String current,List<String> result){
        if(N==current.length()){
            result.add(current);
            return;
        }
        generate(N,current+'0',result);
        if(current.isEmpty()||current.charAt(current.length()-1)!='1'){
            generate(N,current+'1',result);
        }
    }
}
