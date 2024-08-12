
class Solution
{
    public int[] AllPrimeFactors(int N)
    {
  List<Integer> primeFactors = new ArrayList<>();

        
        if (N % 2 == 0) {
            primeFactors.add(2);
            while (N % 2 == 0) {
                N /= 2;
            }
        }

        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                primeFactors.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }

        
        if (N > 2) {
            primeFactors.add(N);
        }

        
        int[] result = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            result[i] = primeFactors.get(i);
        }

        return result;
    }
}