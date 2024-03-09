public class AAA {
    public static void main(String args[]) {
       String str1="silent";
       String str2="listen";
       int n1=str1.length();
       int n2=str2.length();
       boolean result=Anagram(str1,str2,n1,n2);
       System.out.println(result);
    }
    static final int CHAR=256;
    static boolean Anagram(String s1,String s2,int n1, int n2){
            if(n1!=n2){
                return false;
            }
            int count[]=new int[CHAR];
            for(int i=0;i<s1.length();i++){
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }
            for(int i=0;i<CHAR;i++)
                if(count[i]>0)
                    return false;

                return true;
    
    }
   /* static boolean Anagram(String s1,String s2,int n1, int n2){
        if(n1!=n2){
            return false;
        }
        char[] a1=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char[] a2=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
       return  s1.equals(s2);
    }*/
}