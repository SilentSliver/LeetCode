package silversliver.silversliver_2081;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long kMirror(int k, int n) {
        var ans = 0L;
        for (var cur_dig = 1;; cur_dig++) {
            // 根据位数遍历，列出位数的范围
            var l = (int) Math.pow(10, (cur_dig - 1) >> 1);
            var r = (int) Math.pow(10, (cur_dig + 1) >> 1);
            // 遍历位数范围内的数字
            for (var i = l; i < r; i++) {
                long cur_val = i;
                // 判断当前位数是奇数还是偶数，偶数则直接拼接, 奇数则少取一位
                var tar_half = (cur_dig % 2 == 0) ? i : i / 10;
                // 更新到cur_val里
                while (tar_half > 0) {
                    cur_val = cur_val * 10 + tar_half % 10;
                    tar_half /= 10;
                }
                // 回文数判断
                if (check(cur_val, k)) {
                    ans += cur_val;
                    n--;
                    if (n == 0)
                        return ans;
                }
            }
        }
    }

    private boolean check(long num, int k) {
        // 将num转换为列表存储
        var list_num = new ArrayList<Integer>();
        // 将num转换为对应进制的数字
        while (num > 0) {
            list_num.add((int) (num % k));
            num /= k;
        }
        // 检查num是否为回文数字
        for (int i = 0, j = list_num.size() - 1; i < j; ++i, --j)
            if (!list_num.get(i).equals(list_num.get(j)))
                return false;
        return true;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int k = Integer.parseInt(inputJsonValues[0]);
		int n = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(kMirror(k, n));
    }
}
