class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.length()==0) return true;
        String doubled=s+s;
       return doubled.contains(goal);
        
    }
}