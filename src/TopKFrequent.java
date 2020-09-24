import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public int[] top(int[] nums, int k) {

        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        //getOrDefault(num,defaultValue:0) 如果map中有num时，就使用num对应的value，没有的话用defaultValue代替

        //建立小顶堆
        // int[] 的第一个元素代表数组的值，第二个元素代表了该值出现的次数
        PriorityQueue<int[]> MinHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        //遍历「出现次数数组」：
        //如果堆的元素个数小于 k，就可以直接插入堆中。
        //如果堆的元素个数等于 k，则检查堆顶与当前出现次数的大小。如果堆顶更大，说明至少有 k个数字的出现次数比当前值大，故舍弃当前值；
        //否则，就弹出堆顶，并将当前值插入堆中。
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (MinHeap.size() == k) {
                if (MinHeap.peek()[1] < count) {
                    MinHeap.poll();
                    MinHeap.offer(new int[]{num, count});
                }
                //peek：返回队列头部元素
                //poll：移除并返回头部元素
                //offer：添加一个元素并返回true or false
            } else {
                MinHeap.offer(new int[]{num, count});
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = MinHeap.poll()[0];
        }
        return ret;
    }

    public static void main(String[] args) {
        int a[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        TopKFrequent test=new TopKFrequent();
        for(int i=0;i<2;i++){
            System.out.println(test.top(a,2)[i]);
        }
    }
}

/*  借助 HashMap 数据结构
    public int[] TopKFrequent(int[] nums, int k) {
        int[] res = new int[k];    // 结果数组
        Map<Integer, Integer> map = new HashMap();
        // 统计数组中各元素出现的次数
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        int maxTimes = 0;    // 出现最多的元素的出现次数
        // 找出出现次数最多的元素出现的次数
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxTimes){
                maxTimes = entry.getValue();
            }
        }

        // 按出现次数从大到小添加到结果数组
        while(k > 0){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == maxTimes){
                    res[k - 1] = entry.getKey();
                    k--;
                }
            }
            maxTimes--;
        }

        return res;
    }
    */

