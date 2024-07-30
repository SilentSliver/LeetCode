package silversliver.silversliver_682;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int calPoints(String[] opt) {
        var res = new ArrayDeque<Integer>();
        for (String s: opt) {
            if (s.equals("C"))
                res.pop();
            else if (s.equals("D"))
                res.push(res.peek() * 2);
            else if (s.equals("+")){
                var tmp1 = res.pop();
                var tmp2 = res.peek();
                res.push(tmp1);
                res.push(tmp1 + tmp2);
            } else
                res.push(Integer.parseInt(s));
        }
        var ans = 0;
        while (!res.isEmpty())
            ans += res.pop();
        return ans;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operations = jsonArrayToStringArray(inputJsonValues[0]);
        return JSON.toJSON(calPoints(operations));
    }
}
