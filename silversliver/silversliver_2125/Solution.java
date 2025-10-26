package silversliver.silversliver_2125;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int numberOfBeams(String[] bank) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String[] bank = jsonArrayToStringArray(inputJsonValues[0]);
        return JSON.toJSON(numberOfBeams(bank));
    }
}
