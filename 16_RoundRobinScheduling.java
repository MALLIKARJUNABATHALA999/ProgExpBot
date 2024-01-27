import java.util.ArrayDeque;
import java.util.Queue;

class Process{
    String name;
    int bursttime;
    public  Process(String name,int bursttime){
        this.name=name;
        this.bursttime=bursttime;
    }

}
public class RoundRobinScheduler{
    public static void main(String args[]){
        Process[] processes;
        processes = new Process[]{
                new Process("P0", 10),
                new Process("P1", 5),
                 new Process("P2",3),
                new Process("P3",15),
                new Process("P4",10),
                new Process("P5",8),

        };
        int timequantum=2;
        roundrobinscheduler( processes,timequantum);
    }
    public static void roundrobinscheduler(Process[] processes,int timequantum){
        Queue<Process> queue=new ArrayDeque<>();
        for(Process process:processes){
            queue.add(process);
        }
        while(!queue.isEmpty()){
            Process currentprocess=queue.poll();
            int remainingbursttime=Math.max(0,currentprocess.bursttime-timequantum);
            System.out.println("executing"+currentprocess.name+"for"+timequantum+"units");
            currentprocess.bursttime=remainingbursttime;
            if(remainingbursttime>0){
                queue.add(currentprocess);
            }
        }
    }
}