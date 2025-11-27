package silversliver.silversliver_118;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<List<Integer>> generate(int numRows) {
        var ans = new ArrayList<List<Integer>>();
        for (var i = 0; i < numRows; i++){
            var cur_line = new ArrayList<Integer>();
            cur_line.add(1);
            while (cur_line.size() < i)
                cur_line.add(ans.get(i - 1).get(cur_line.size() - 1) + ans.get(i - 1).get(cur_line.size()));
            if (!ans.isEmpty())
                cur_line.add(1);
            ans.add(cur_line);
        }
        return ans;
    }
    @Override
    public Object solve(String[] inputJsonValues) {
        int numRows = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(generate(numRows));
    }
}
