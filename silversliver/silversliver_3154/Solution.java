package silversliver.silversliver_3154;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int waysToReachStair(int k) {
        return dfs(1, 0, 0, k, new HashMap<>());
    }

    private int dfs(int i, int j, int preDown, int k, Map<Long, Integer> memo) {
        if (i > k + 1) 
            return 0;
        

        long mask = (long) i << 32 | j << 1 | preDown;
        if (memo.containsKey(mask)) 
            return memo.get(mask);
        
        int res = i == k ? 1 : 0;
        res += dfs(i + (1 << j), j + 1, 0, k, memo); 
        if (preDown == 0 && i > 0) 
            res += dfs(i - 1, j, 1, k, memo); 
        memo.put(mask, res); 
        return res;
    }


    @Override
    public Object solve(String[] inputJsonValues) {
        int k = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(waysToReachStair(k));
    }
}
