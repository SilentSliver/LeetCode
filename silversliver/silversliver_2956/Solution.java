package silversliver.silversliver_2956;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        var s1 = new int[101];
        var s2 = new int[101];
        for (var i: nums1) s1[i] = 1;
        for (var i: nums2) s2[i] = 1;
        var ans = new int[2];
        for (var i: nums1) if (s2[i] != 0) ans[0]++;
        for (var i: nums2) if (s1[i] != 0) ans[1]++;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums1 = jsonArrayToIntArray(inputJsonValues[0]);
		int[] nums2 = jsonArrayToIntArray(inputJsonValues[1]);
        return JSON.toJSON(findIntersectionValues(nums1, nums2));
    }
}
