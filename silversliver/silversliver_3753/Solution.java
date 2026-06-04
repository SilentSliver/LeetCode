package silversliver.silversliver_3753;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long totalWaviness(long num1, long num2) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        long num1 = Long.parseLong(inputJsonValues[0]);
		long num2 = Long.parseLong(inputJsonValues[1]);
        return JSON.toJSON(totalWaviness(num1, num2));
    }
}
