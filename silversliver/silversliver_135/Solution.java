package silversliver.silversliver_135;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int candy(int[] ratings) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] ratings = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(candy(ratings));
    }
}
