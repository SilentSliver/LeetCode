package silversliver.silversliver_904;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int totalFruit(int[] fruits) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] fruits = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(totalFruit(fruits));
    }
}
