public class AAA {
    public static void main(String args[]) {
        //String s1="bathalamallikarjuna";
        String s1="ABCD";
        int n=s1.length();
        String s2="CD";
        int m=s2.length();
        //Time complexity O(2^n*n) 2^n generate for subsequence and n for
        //comparing the string if it is present or not in the array
        boolean result=subSequence(s1,s2,n,m);
        System.out.println(result);

    }
    static boolean subSequence(String s1,String s2,int n,int m){
       if(m==0){
           return true;
       }
       if(n==0){
           return false;
       }
       if(s1.charAt(n-1)==s2.charAt(m-1))
           return subSequence(s1,s2,n-1,m-1);

       else
           return subSequence(s1,s2,n-1,m);


    }
}