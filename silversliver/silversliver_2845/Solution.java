package silversliver.silversliver_2845;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        var n = nums.size();
        var arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = nums.get(i) % modulo == k ? 1 : 0;

        var cnt = new HashMap<Integer, Integer>();
        cnt.put(0, 1);
        var ans = 0L;
        var s = 0;
        for (var x : arr) {
            s += x;
            ans += cnt.getOrDefault((s - k + modulo) % modulo, 0);
            cnt.merge(s % modulo, 1, Integer::sum);
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        List<Integer> nums = jsonArrayToIntList(inputJsonValues[0]);
		int modulo = Integer.parseInt(inputJsonValues[1]);
		int k = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(countInterestingSubarrays(nums, modulo, k));
    }
}
