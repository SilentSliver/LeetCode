package silversliver.silversliver_1323;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maximum69Number (int num) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int num = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON((num));
    }
}
