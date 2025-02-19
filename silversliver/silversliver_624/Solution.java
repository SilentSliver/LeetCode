package silversliver.silversliver_624;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0, n = arrays.size(), cur_size = arrays.get(0).size();
        int min = arrays.get(0).get(0), max = arrays.get(0).get(cur_size - 1);
        for (int i = 1; i < n; i++){
            var cur = arrays.get(i);
            cur_size = cur.size();
            ans = Math.max(Math.max(max - cur.get(0), cur.get(cur_size - 1) - min), ans);
            max = Math.max(max, cur.get(cur_size - 1));
            min = Math.min(min, cur.get(0));
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        List<List<Integer>> arrays = jsonArrayTo2DIntList(inputJsonValues[0]);
        return JSON.toJSON(maxDistance(arrays));
    }
}
