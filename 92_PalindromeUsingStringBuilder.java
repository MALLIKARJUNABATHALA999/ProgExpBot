public class AAA {
    public static void main(String args[]) {
        //String s1="bathalamallikarjuna";
        String s1="ABCBA";
        boolean result=isPalindrome(s1);
        System.out.println(result);

    }
   static  boolean isPalindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
}