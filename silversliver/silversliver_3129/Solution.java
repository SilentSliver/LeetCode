package silversliver.silversliver_3129;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        final int MOD = 1_000_000_007;
        int[][][] f = new int[zero + 1][one + 1][2];
        for (int i = 1; i <= Math.min(limit, zero); i++)
            f[i][0][0] = 1;

        for (int j = 1; j <= Math.min(limit, one); j++)
            f[0][j][1] = 1;

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                // + MOD 保证答案非负
                f[i][j][0] = (int) (((long) f[i - 1][j][0] + f[i - 1][j][1] + (i > limit ? MOD - f[i - limit - 1][j][1] : 0)) % MOD);
                f[i][j][1] = (int) (((long) f[i][j - 1][0] + f[i][j - 1][1] + (j > limit ? MOD - f[i][j - limit - 1][0] : 0)) % MOD);
            }
        }
        return (f[zero][one][0] + f[zero][one][1]) % MOD;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int zero = Integer.parseInt(inputJsonValues[0]);
		int one = Integer.parseInt(inputJsonValues[1]);
		int limit = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(numberOfStableArrays(zero, one, limit));
    }
}
