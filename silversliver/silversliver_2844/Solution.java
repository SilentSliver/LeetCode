package silversliver.silversliver_2844;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    private Integer[][] f;
    private String num;
    private int n;

    public int minimumOperations(String num) {
        n = num.length();
        this.num = num;
        f = new Integer[n][25];
        return dfs(0, 0);
    }

    private int dfs(int i, int k) {
        if (i == n) 
            return k == 0 ? 0 : n;
        if (f[i][k] != null) 
            return f[i][k];
        f[i][k] = dfs(i + 1, k) + 1;
        f[i][k] = Math.min(f[i][k], dfs(i + 1, (k * 10 + num.charAt(i) - '0') % 25));
        return f[i][k];
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String num = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(minimumOperations(num));
    }
}
