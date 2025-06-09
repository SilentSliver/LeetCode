package silversliver.silversliver_2434;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public String robotWithString(String s) {
        var cnt = new int[26];
        for (var c : s.toCharArray())
            cnt[c - 'a']++;
        var ans = new StringBuilder();
        var stack = new ArrayDeque<Character>();
        var min_char = 'a';
        for (var c : s.toCharArray()) {
            --cnt[c - 'a'];
            while (min_char < 'z' && cnt[min_char - 'a'] == 0)
                min_char++;
            stack.push(c);
            while (!stack.isEmpty() && stack.peek() <= min_char)
                ans.append(stack.pop());
        }
        return ans.toString();
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(robotWithString(s));
    }
}
