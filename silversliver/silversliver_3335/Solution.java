package silversliver.silversliver_3335;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    static final int mod = (int) 1e9 + 7;

    public int lengthAfterTransformations(String s, int t) {
        var f = new int[t + 1][26];
        for (var c : s.toCharArray()) {
            f[0][c - 'a']++;
        }
        for (var i = 1; i <= t; ++i) {
            f[i][0] = f[i - 1][25] % mod;
            f[i][1] = (f[i - 1][0] + f[i - 1][25]) % mod;
            for (var j = 2; j < 26; j++)
                f[i][j] = f[i - 1][j - 1] % mod;
        }

        var ans = 0;
        for (var j = 0; j < 26; ++j) {
            ans = (ans + f[t][j]) % mod;
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		int t = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(lengthAfterTransformations(s, t));
    }
}
