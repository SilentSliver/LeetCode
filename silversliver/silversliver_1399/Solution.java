package silversliver.silversliver_1399;

import com.alibaba.fastjson.JSON;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int countLargestGroup(int n) {
        var cnt = new int[40];
        int ans = 0, cur_max = 0;
        for (var i = 1; i <= n; ++i) {
            var sum = 0;
            for (var x = i; x > 0; x /= 10)
                sum += x % 10;

            ++cnt[sum];
            if (cur_max < cnt[sum]) {
                cur_max = cnt[sum];
                ans = 1;
            } else if (cur_max == cnt[sum]) {
                ++ans;
            }
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(countLargestGroup(n));
    }
}
