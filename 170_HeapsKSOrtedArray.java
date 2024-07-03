import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 18, 19, 17};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        sortK(arr, k, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortK(int[] arr, int k, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add first k+1 elements to the priority queue
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        
        int index = 0;
        
        // Process remaining elements
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        
        // Empty the priority queue
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }
}
