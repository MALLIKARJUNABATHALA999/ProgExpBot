public class AAA {
    public static void main(String args[]) {
        //String s1="bathalamallikarjuna";
        String s1="ABCD";
        String s2="CDe";
        //Time complexity O(2^n*n) 2^n generate for subsequence and n for
        //comparing the string if it is present or not in the array
        boolean result=subSequence(s1,s2);
        System.out.println(result);

    }
    static boolean subSequence(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;j++;
            }
            else{
                i++;
            }
        }
        return (j==n2);
    }
}