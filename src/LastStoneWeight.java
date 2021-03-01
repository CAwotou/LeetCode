import java.util.PriorityQueue;

public class LastStoneWeight {
    public int weight(int[] stones){
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a>b){
                pq.offer(a-b);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight test=new LastStoneWeight();
        int[] stones={2,7,4,1,8,1};
        System.out.println(test.weight(stones));
    }
}


