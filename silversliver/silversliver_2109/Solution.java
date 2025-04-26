package silversliver.silversliver_2109;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public String addSpaces(String s, int[] spaces) {
        var ans = new StringBuffer();
        var space_idx = 0;
        for (int i = 0; i < s.length(); i++)
            ans.append(space_idx < spaces.length && i == spaces[space_idx] ? " " + s.charAt(spaces[space_idx++]) : s.charAt(i));
        return ans.toString();
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		int[] spaces = jsonArrayToIntArray(inputJsonValues[1]);
        return JSON.toJSON(addSpaces(s, spaces));
    }
}
