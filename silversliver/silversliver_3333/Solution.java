package silversliver.silversliver_3333;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    final int mod = (int) 1e9 + 7;
    public int possibleStringCount(String word, int k) {
        var nums = new ArrayList<Integer>();
        var ans = 1L;
        var cur = 0;
        var n = word.length();
        // 更新字符数量, 由于字符之间不连续时不能合并计算，因此可以直接把问题简化成不同的字符
        for (var i = 0; i < n; i++) {
            // 记录当前字符数量
            cur++;
            // 若到结尾或下一位与当前不一致的时候进入分支
            if (i == n - 1 || word.charAt(i) != word.charAt(i + 1)) {
                // 如当前字符数量大于1的时候进入分支
                if (cur > 1) {
                    // 这时k大于0，则将数字添加至末尾
                    // k小于0时添加末尾处理的意义不大，此时表示即使每个字符只选择一次也满足题目要求了
                    if (k > 0)
                        nums.add(cur - 1);
                    // 更新方案数
                    ans = ans * cur % mod;
                }
                // 计数器至0, 同时可用的字符数-1
                cur = 0;
                k--;
            }
        }
        // 如果k < 1， 说明当前ans即为结果
        if (k < 1)
            return (int) ans;
        // 记录出现了多少段字母
        var m = nums.size();
        // 二维表记录迭代
        var f = new int[m + 1][k];
        // 表示没有字符的情况下，选0个字符的方案数为1
        f[0][0] = 1;
        // 从1个字符起开始迭代
        for (var i = 1; i <= m; i++) {
            var x = nums.get(i - 1);
            // 前缀和优化数组
            var s = new long[k + 1];
            for (var j = 0; j < k; j++)
                s[j + 1] = (s[j] + f[i - 1][j]) % mod;
            // 前缀和优化计算更新当前i下fij的值
            for (var j = 0; j < k; j++) {
                var l = Math.max(0, j - x);
                f[i][j] = (int) ((s[j + 1] - s[l] + mod) % mod);
            }
        }

        var sum = 0L;
        for (var j = 0; j < k; j++)
            sum = (sum + f[m][j]) % mod;

        return (int) ((ans - sum + mod) % mod);
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(possibleStringCount(word, k));
    }
}
