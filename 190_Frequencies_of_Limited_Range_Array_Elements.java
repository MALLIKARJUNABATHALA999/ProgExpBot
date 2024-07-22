class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        
        // Step 1: Create a HashMap to count frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Count the frequencies of elements in the range [1, n]
        for (int num : arr) {
            if (num >= 1 && num <= N) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        // Step 3: Update the array with the frequencies
        for (int i = 0; i < N; i++) {
            arr[i] = frequencyMap.getOrDefault(i + 1, 0);
        }
   
    }
}
