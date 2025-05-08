package silversliver.silversliver_3146;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int findPermutationDifference(String s, String t) {
        int[] pos = new int[26];
        for (int i = 0; i < s.length(); i++) 
            pos[s.charAt(i) - 'a'] = i;
        
        int ans = 0;
        for (int i = 0; i < t.length(); i++) 
            ans += Math.abs(i - pos[t.charAt(i) - 'a']);
        
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		String t = jsonStringToString(inputJsonValues[1]);
        return JSON.toJSON(findPermutationDifference(s, t));
    }
}
