package silversliver.silversliver_440;

import com.alibaba.fastjson.JSON;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    private int len;

    public int findKthNumber(int n, int k) {
        len = n;
        var cur = 1L;
        // 当前剩余位数
        --k;
        while (k > 0) {
            // 步进策略, 根据当前位
            var cnt = count(cur);
            if (k >= cnt) {
                k -= cnt;
                ++cur;
            } else {
                --k;
                cur *= 10;
            }
        }
        return (int) cur;
    }

    public int count(long cur) {
        var next = cur + 1L;
        var cnt = 0L;
        while (cur <= len) {
            cnt += Math.min(len - cur + 1, next - cur);
            next *= 10;
            cur *= 10;
        }
        return (int) cnt;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(findKthNumber(n, k));
    }
}
