package silversliver.silversliver_2131;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> cnt = new HashMap<>();
        for (var w : words) cnt.merge(w, 1, Integer::sum);
        int ans = 0, cur = 0;
        for (var e : cnt.entrySet()) {
            var key = e.getKey();
            var value = e.getValue();
            var rk = new StringBuilder(key).reverse().toString();
            if (key.charAt(0) == key.charAt(1)) {
                cur += value & 1;
                ans += value / 2 * 2 * 2;
            } else
                ans += Math.min(value, cnt.getOrDefault(rk, 0)) * 2;

        }
        ans += cur > 0 ? 2 : 0;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String[] words = jsonArrayToStringArray(inputJsonValues[0]);
        return JSON.toJSON(longestPalindrome(words));
    }
}
