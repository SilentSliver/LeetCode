package silversliver.silversliver_2014;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    private char[] s;

    public String longestSubsequenceRepeatedK(String s, int k) {
        this.s = s.toCharArray();
        int[] cnt = new int[26];
        for (char c : this.s)
            cnt[c - 'a']++;
        List<Character> cs = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++)
            if (cnt[c - 'a'] >= k)
                cs.add(c);
        Deque<String> q = new ArrayDeque<>();
        q.offer("");
        String ans = "";
        while (!q.isEmpty()) {
            String cur = q.poll();
            for (char c : cs) {
                String nxt = cur + c;
                if (check(nxt, k)) {
                    ans = nxt;
                    q.offer(nxt);
                }
            }
        }
        return ans;
    }

    private boolean check(String t, int k) {
        int i = 0;
        for (char c : s)
            if (c == t.charAt(i)) {
                i++;
                if (i == t.length()) {
                    if (--k == 0)
                        return true;
                    i = 0;
                }
            }
        return false;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(longestSubsequenceRepeatedK(s, k));
    }
}
