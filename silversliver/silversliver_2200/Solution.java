package silversliver.silversliver_2200;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        var ans = new ArrayList<Integer>();
        var jset = new ArrayList<Integer>();
        var n = nums.length;
        for (var i = 0; i < n; i++)
            if (nums[i] == key)
                jset.add(i);
        for (var i = 0; i < n; i++) {
            for (int j: jset)
                if (Math.abs(i - j) <= k){
                    ans.add(i);
                    break;
                }
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int key = Integer.parseInt(inputJsonValues[1]);
		int k = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(findKDistantIndices(nums, key, k));
    }
}
