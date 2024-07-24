package src;

import java.util.Stack;

public class BalancingParanthesis {
    public static void main(String args[]){
        String str="{[()]}";
       System.out.println(balance(str));

    }
    static boolean balance(String str){
        for(int i=0;i<str.length();i++){
            Stack<Character> s=new Stack<Character>();
            if(Character.toString(str.charAt(i))=="("|| Character.toString(str.charAt(i))=="["|| Character.toString(str.charAt(i))=="{"){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()==true){
                    return false;
                }
                else if(compare(s.peek(),str.charAt(i))==false){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return true;
    }
     static boolean compare(char a,char b){
        return (a=='('&& b==')'||a=='['&& b==']'||a=='{'&& b=='}');
    }
}
