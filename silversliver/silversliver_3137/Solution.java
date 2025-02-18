package silversliver.silversliver_3137;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length();
        int mx = 0;
        HashMap<String, Integer> cnt = new HashMap<>();
        for (int i = k; i <= n; i += k) {
            String sub = word.substring(i - k, i);
            int c = cnt.merge(sub, 1, Integer::sum); // c = ++cnt[sub]
            mx = Math.max(mx, c);
        }
        return n / k - mx;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(minimumOperationsToMakeKPeriodic(word, k));
    }
}
