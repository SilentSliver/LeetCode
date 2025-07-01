package silversliver.silversliver_3330;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int possibleStringCount(String word) {
        var ans = 1;
        char last_char = 'a' - 1;
        for (char c: word.toCharArray())
            if (c != last_char) last_char = c;
            else ans++;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(possibleStringCount(word));
    }
}
