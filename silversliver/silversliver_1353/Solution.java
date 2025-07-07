package silversliver.silversliver_1353;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxEvents(int[][] events) {
        var map = new HashMap<Integer, List<Integer>>();
        var min = Integer.MAX_VALUE;
        var max = 0;
        for (var event: events){
            map.computeIfAbsent(event[0], k -> new ArrayList<>()).add(event[1]);
            min = Math.min(min, event[0]);
            max = Math.max(max, event[1]);
        }
        var pq = new PriorityQueue<Integer>();
        var ans = 0;
        for (var s = min; s <= max; s++){
            while(!pq.isEmpty() && pq.peek()  < s)
                pq.poll();
            for (var e: map.getOrDefault(s, List.of()))
                pq.offer(e);
            if (!pq.isEmpty()){
                pq.poll();
                ans++;
            }
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] events = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(maxEvents(events));
    }
}
