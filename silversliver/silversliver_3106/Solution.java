package silversliver.silversliver_3106;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {

        public String getSmallestString(String s, int k) {
            var cs = s.toCharArray();
            for (var i = 0; i < cs.length; ++i) {
                var c1 = cs[i];
                for (var c2 = 'a'; c2 < c1; ++c2) {
                    var d = Math.min(c1 - c2, 26 - c1 + c2);
                    if (d <= k) {
                        cs[i] = c2;
                        k -= d;
                        break;
                    }
                }
            }
            return new String(cs);
        }


    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(getSmallestString(s, k));
    }
}
