package silversliver.silversliver_2610;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<List<Integer>> findMatrix(int[] nums) {
        var n = nums.length;
        var cnt = new int[n + 1];
        for (int num: nums) cnt[num]++;
        var ans = new ArrayList<List<Integer>>();
        for (var i = 1; i <= n; i++){
            var cur = cnt[i];
            for (var j = 0; j < cur; j++) {
                if (ans.size() <= j) {
                    ans.add(new ArrayList<>());
                }
                ans.get(j).add(i);
            }
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(findMatrix(nums));
    }
}
