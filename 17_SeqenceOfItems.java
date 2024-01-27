import java.util.*;
public class SequenceOfItems {
    public static void main(String args[]){
        char arr[]={'d','e','a','x','q','r','x','p','y'};
        char arr1[]={'y','y','y','y','y'};
        ArrayList<Character> charr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='x'){
                charr.add('y');
                charr.add('y');
                charr.add('y');
                charr.add('y');
                charr.add('y');
            }
            else{
                charr.add(arr[i]);
            }
        }
        for (char ch : charr) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
