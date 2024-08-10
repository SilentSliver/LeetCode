package silversliver.silversliver_3132;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int x = nums2[0] - nums1[i];
            if (f(nums1, nums2, x))
                ans = Math.min(ans, x);
        }
        return ans;
    }

    private boolean f(int[] nums1, int[] nums2, int x) {
        int i = 0, j = 0, cnt = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] - nums1[i] != x) ++cnt;
            else j++;
            i++;
        }
        return cnt <= 2;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums1 = jsonArrayToIntArray(inputJsonValues[0]);
		int[] nums2 = jsonArrayToIntArray(inputJsonValues[1]);
        return JSON.toJSON(minimumAddedInteger(nums1, nums2));
    }
}
