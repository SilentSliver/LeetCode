package silversliver.silversliver_3085;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumDeletions(String word, int k) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(minimumDeletions(word, k));
    }
}
