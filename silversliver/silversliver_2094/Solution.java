package silversliver.silversliver_2094;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] findEvenNumbers(int[] digits) {
        int[] cnt = new int[10];
        for (int d : digits) {
            cnt[d]++;
        }

        List<Integer> ans = new ArrayList<>();
        dfs(0, 0, cnt, ans);
        return ans.stream().mapToInt(i -> i).toArray();
    }

    // i=0 百位，i=1 十位，i=2 个位，x 表示当前正在构造的数字
    private void dfs(int i, int x, int[] cnt, List<Integer> ans) {
        if (i == 3) {
            ans.add(x);
            return;
        }
        for (int d = 0; d < 10; d++) {
            if (cnt[d] > 0 && (i == 0 && d > 0 || i == 1 || i == 2 && d % 2 == 0)) {
                cnt[d]--; // 消耗一个数字 d
                dfs(i + 1, x * 10 + d, cnt, ans);
                cnt[d]++; // 复原
            }
        }
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] digits = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(findEvenNumbers(digits));
    }
}
