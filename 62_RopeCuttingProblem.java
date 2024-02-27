public class RopeCuttingProblem {
    public static void main(String args[]){
        System.out.println(ropecutting(10,3,5,2));
    }
    public static int ropecutting(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=Math.max(ropecutting(n-a,a,b,c),ropecutting(n-b,a,b,c));
        int res1=Math.max(ropecutting(n-c,a,b,c),res);
        if(res==-1){
            return -1;
        }
        return res+1;
    }
}