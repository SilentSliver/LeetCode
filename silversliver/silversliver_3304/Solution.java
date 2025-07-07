package silversliver.silversliver_3304;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public char kthCharacter(int k) {
        var word = new ArrayList<Integer>();
        word.add(0);
        while (word.size() < k)
            for (int i = 0, m = word.size(); i < m; i++)
                word.add((word.get(i) + 1) % 26);
        return (char) ('a' + word.get(k - 1));
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int k = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(kthCharacter(k));
    }
}
