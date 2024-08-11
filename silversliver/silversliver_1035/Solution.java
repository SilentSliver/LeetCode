package silversliver.silversliver_1035;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxUncrossedLines(int[] s1, int[] s2) {
        int n = s1.length, m = s2.length;
        var f = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                if (s1[i - 1] == s2[j - 1])
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);
            }
        return f[n][m];
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums1 = jsonArrayToIntArray(inputJsonValues[0]);
		int[] nums2 = jsonArrayToIntArray(inputJsonValues[1]);
        return JSON.toJSON(maxUncrossedLines(nums1, nums2));
    }
}
