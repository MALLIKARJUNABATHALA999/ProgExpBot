public class AAA {
    public static void main(String args[]) {
        //String s1="bathalamallikarjuna";
        String s1 = "vikatakiv";
        int n=s1.length();
        boolean flag=true;
        int begin=0;
        int end=s1.length()-1;
        while(begin<end){
            if(s1.charAt(begin)!=s1.charAt(end)){
                flag= false;
                break;
            }
            begin++;
            end--;
        }
        if(flag==true){
            System.out.println("Palindrone");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}