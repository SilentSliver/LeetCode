package silversliver.silversliver_1963;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minSwaps(String s) {
        var cnt = 0;
        for (char c: s.toCharArray())
            if (c == '[' || cnt == 0)
                cnt++;
            else
                cnt--;
        return cnt / 2;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(minSwaps(s));
    }
}
