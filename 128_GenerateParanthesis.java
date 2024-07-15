package src;

class Solution {
    List<String> result=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        generatevalue(result,0,0,n,"");
        return result;
    }
    private void generatevalue(List<String> result,int open,int close,int n,String str){
        if(str.length()==2*n){
            result.add(str);
            return;
        }
        if(open<n){
            generatevalue(result,open+1,close,n,str+"(");
        }
        if(close<open){
            generatevalue(result,open,close+1,n,str+")");
        }

    }
}
