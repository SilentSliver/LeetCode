package silversliver.silversliver_2844;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumOperations(String num) {
        return 0;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String num = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(minimumOperations(num));
    }
}
