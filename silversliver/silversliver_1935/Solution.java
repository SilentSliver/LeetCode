package silversliver.silversliver_1935;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int canBeTypedWords(String text, String brokenLetters) {
        var broken_set = new HashSet<Character>();
        for (var c: brokenLetters.toCharArray())
            broken_set.add(c);
        var test_char_array = text.toCharArray();
        var ans = 0;
        var matched = false;
        for (var i = 0; i < test_char_array.length; i++) {
            var cur_char = test_char_array[i];
            if (cur_char == ' ' && !matched)
                ans++;
            else if (cur_char == ' ' && matched)
                matched = false;
            else if (matched)
                continue;
            else if (broken_set.contains(cur_char))
                matched = true;
        }
        if (!matched)
            ans++;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String text = jsonStringToString(inputJsonValues[0]);
		String brokenLetters = jsonStringToString(inputJsonValues[1]);
        return JSON.toJSON(canBeTypedWords(text, brokenLetters));
    }
}
