package silversliver.silversliver_600;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {

    private char[] s;
    private Integer[][] f;

    public int findIntegers(int n) {
        s = Integer.toBinaryString(n).toCharArray();
        f = new Integer[s.length][2];
        return dfs(0, 0, true);
    }

    private int dfs(int pos, int pre, boolean limit) {
        if (pos >= s.length)
            return 1;
        if (!limit && f[pos][pre] != null)
            return f[pos][pre];
        var up = limit ? s[pos] - '0' : 1;
        var ans = 0;
        for (var i = 0; i <= up; i++)
            if (!(pre == 1 && i == 1))
                ans += dfs(pos + 1, i, limit && i == up);
        if (!limit)
            f[pos][pre] = ans;
        return ans;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(findIntegers(n));
    }
}
