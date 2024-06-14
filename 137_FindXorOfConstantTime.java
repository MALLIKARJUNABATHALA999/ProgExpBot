class Solution {
  public static int findXOR(int l, int r) {
        return findRangexor(l - 1) ^ findRangexor(r);
    }

    private static int findRangexor(int n) {
        if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else if (n % 4 == 3) return 0;
        else return n;
    }

}