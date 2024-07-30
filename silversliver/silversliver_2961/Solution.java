package silversliver.silversliver_2961;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<>();
        for (var i = 0; i < variables.length; ++i) {
            var e = variables[i];
            int a = e[0], b = e[1], c = e[2], m = e[3];
            if (qpow(qpow(a, b, 10), c, m) == target)
                ans.add(i);

        }
        return ans;
    }

    private int qpow(long a, int n, int mod) {
        var ans = 1L;
        for (; n > 0; n >>= 1) {
            if ((n & 1) == 1)
                ans = ans * a % mod;
            a = a * a % mod;
        }
        return (int) ans;
    }


    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] variables = jsonArrayToInt2DArray(inputJsonValues[0]);
		int target = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(getGoodIndices(variables, target));
    }
}
