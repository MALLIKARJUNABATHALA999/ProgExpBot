    import java.net.SocketOption;
    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            int[] arr={5,15,10,20,8,25,18};
            int k=3;
            ArrayList<Integer> ans=klargestElements(arr,k);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }

        }
        private static ArrayList<Integer> klargestElements(int[] arr,int k){
            ArrayList<Integer> result=new ArrayList<>();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i=0;i<k;i++){
                pq.add(arr[i]);
            }
            for(int i=k;i<arr.length;i++){
                if(pq.peek()<arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
            while(!pq.isEmpty()){
                result.add(pq.poll());
            }
            return result;
        }
    }
