class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chararray1=s.toCharArray();
        Arrays.sort(chararray1);
        char[] chararray2=t.toCharArray();
        Arrays.sort(chararray2);
        return Arrays.equals(chararray1,chararray2);
        }
}